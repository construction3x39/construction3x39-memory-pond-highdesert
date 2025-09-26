(ns site.render.svelte
  (:require [clojure.string :as str]))

(defmulti render first)

(defn- esc [s]
  (-> s (str/replace "&" "&amp;")
         (str/replace "<" "&lt;")
         (str/replace ">" "&gt;")))

(defn- h* [tag {:keys [id text]}]
  (str "<" tag " id=\"" id "\">" (esc text) "</" tag ">\n"))

(defmethod render :h1 [[_ m]] (h* "h1" m))
(defmethod render :h2 [[_ m]] (h* "h2" m))
(defmethod render :h3 [[_ m]] (h* "h3" m))
(defmethod render :p  [[_ s]] (str "<p>" (esc s) "</p>\n"))
(defmethod render :default [x] (str x))

(defn- headings [body] (filter (comp #{:h1 :h2 :h3} first) body))

(defn- toc-item [[k {:keys [id text]}]]
  (let [pad (case k :h1 0 :h2 1 :h3 2 0)
        indent (apply str (repeat pad "&nbsp;&nbsp;"))]
    (str "<li>" indent "<a href=\"#" id "\">" (esc text) "</a></li>\n")))

(defn toc-html [body]
  (let [hs (headings body)]
    (when (seq hs)
      (str "<details class=\"card\" style=\"margin:1rem 0;\">"
           "<summary><strong>Table of contents</strong></summary>"
           "<ul>\n" (apply str (map toc-item hs)) "</ul>\n"
           "</details>\n"))))

(def header "<script>export let sitemap;</script>\n")
(def footer "<p style=\"margin-top:2rem;\"><a href=\"/en/\">← Back</a></p>\n")

(defn page->svelte [{:keys [title body]}]
  (str header "<h1>" (esc title) "</h1>\n"
       (or (toc-html body) "")
       (apply str (map render body))
       footer))
