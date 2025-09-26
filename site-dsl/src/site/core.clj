(ns site.core
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [site.parser :as p]
            [site.render.svelte :as sv]
            [spec.build :as spec]))

(defn spit* [path s]
  (doto (io/file path) (.getParentFile) (.mkdirs))
  (spit path s))

(defn parse-one [^String path]
  (let [ast (p/md->ast (slurp path))]
    {:id (.getName (io/file path)) :path path :ast ast}))

(defn title-of [ast fallback]
  (or (some #(when (= (first %) :h1) (get-in % [1 :text])) ast)
      (-> fallback (str/replace #"^\d+[_-]?" "")
          (str/replace #"\.md$" ""))))

(defn gen-page [{:keys [id ast]}]
  (let [base (subs id 0 (.lastIndexOf id "."))
        title (title-of ast base)
        pg {:id base :title title :body (remove #(= (first %) :h1) ast)}]
    (spit* (str "../web/src/lib/generated/" base ".svelte") (sv/page->svelte pg))
    pg))

(defn- md-files []
  (->> (file-seq (io/file "../docs/en"))
       (filter #(.isFile ^java.io.File %))
       (filter #(str/ends-with? (.getName %) ".md"))
       (sort-by #(.getName %))))

(defn pages []
  (->> (md-files) (map #(parse-one (.getPath %))) (map gen-page)
       (map-indexed (fn [i m] (assoc m :order i))) (doall)))

(defn nav-graph [pages]
  (into {} (map (fn [{:keys [id title order]}]
                  (let [prev (some #(when (= (:order %) (dec order))
                                      (select-keys % [:id :title])) pages)
                        next (some #(when (= (:order %) (inc order))
                                      (select-keys % [:id :title])) pages)]
                    [id {:prev prev :next next}]))
                pages)))

(defn strip-html [s]
  (-> s (str/replace #"<[^>]+>" " ")
         (str/replace #"\s+" " ") str/trim))

(defn body-text [ast]
  (->> ast (map (fn [n]
                  (case (first n)
                    :p (second n)
                    :h2 (get-in n [1 :text])
                    :h3 (get-in n [1 :text])
                    "")))
       (str/join " ")))

(defn search-index [pages]
  (map (fn [{:keys [id title body]}]
         {:id id :title title :text (strip-html (body-text body))})
       pages))

(defn -main [& _]
  (println "🧬 Starting ClojureScript DSL generation with spec validation...")
  
  (let [ps (pages)
        sitemap (map #(select-keys % [:id :title :order]) ps)
        nav (nav-graph ps)
        idx (search-index ps)]
    
    ;; Validate each step with Clojure spec
    (let [page-validation (spec/validate-markdown-parsing ps)
          sitemap-validation (spec/validate-sitemap-generation sitemap)
          nav-validation (spec/validate-nav-generation nav)
          search-validation (spec/validate-search-generation idx)]
      
      ;; Report validation results
      (doseq [validation [page-validation sitemap-validation nav-validation search-validation]]
        (if (= (:status validation) :success)
          (println "✅" (:step validation) "- validation passed")
          (do (println "❌" (:step validation) "- validation failed")
              (println "  Errors:" (:errors validation)))))
      
      ;; Only proceed if all validations pass
      (if (every? #(= (:status %) :success) [page-validation sitemap-validation nav-validation search-validation])
        (do (spit* "../web/static/content/sitemap.json" (pr-str sitemap))
            (spit* "../web/static/content/nav.json" (pr-str nav))
            (spit* "../web/static/content/search-index.json" (pr-str idx))
            (println "🎊 Generated" (count ps) "pages + sitemap/nav/search with spec validation!"))
        (println "🚨 Build failed due to validation errors - see above for details")))))
