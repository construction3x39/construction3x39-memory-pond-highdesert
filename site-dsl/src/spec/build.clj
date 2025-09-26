(ns spec.build
  (:require [clojure.spec.alpha :as s]))

;; Markdown AST specifications
(s/def ::heading-level #{1 2 3})
(s/def ::heading-id string?)
(s/def ::heading-text string?)
(s/def ::heading-data (s/keys :req-un [::heading-id ::heading-text]))

(s/def ::h1 (s/tuple #{:h1} ::heading-data))
(s/def ::h2 (s/tuple #{:h2} ::heading-data))
(s/def ::h3 (s/tuple #{:h3} ::heading-data))
(s/def ::p (s/tuple #{:p} string?))
(s/def ::ast-node (s/or :heading (s/or :h1 ::h1 :h2 ::h2 :h3 ::h3)
                        :paragraph ::p))
(s/def ::ast (s/coll-of ::ast-node))

;; Page specifications
(s/def ::page-id string?)
(s/def ::page-title string?)
(s/def ::page-order nat-int?)
(s/def ::page-body ::ast)
(s/def ::page-path string?)

(s/def ::page (s/keys :req-un [::page-id ::page-title ::page-order ::page-body]
                      :opt-un [::page-path]))

;; Sitemap specifications
(s/def ::sitemap-entry (s/keys :req-un [::page-id ::page-title ::page-order]))
(s/def ::sitemap (s/coll-of ::sitemap-entry))

;; Navigation specifications
(s/def ::nav-prev (s/nilable (s/keys :req-un [::page-id ::page-title])))
(s/def ::nav-next (s/nilable (s/keys :req-un [::page-id ::page-title])))
(s/def ::nav-entry (s/keys :req-un [::nav-prev ::nav-next]))
(s/def ::nav-graph (s/map-of ::page-id ::nav-entry))

;; Search index specifications
(s/def ::search-text string?)
(s/def ::search-entry (s/keys :req-un [::page-id ::page-title ::search-text]))
(s/def ::search-index (s/coll-of ::search-entry))

;; Build output specifications
(s/def ::build-output (s/keys :req-un [::sitemap ::nav-graph ::search-index]))

;; File system specifications
(s/def ::file-path string?)
(s/def ::file-content string?)
(s/def ::markdown-file (s/keys :req-un [::file-path ::file-content]))

;; Validation functions
(defn valid-page? [page]
  (s/valid? ::page page))

(defn valid-sitemap? [sitemap]
  (s/valid? ::sitemap sitemap))

(defn valid-build-output? [output]
  (s/valid? ::build-output output))

;; Error reporting
(defn explain-page-error [page]
  (s/explain-data ::page page))

(defn explain-sitemap-error [sitemap]
  (s/explain-data ::sitemap sitemap))

;; Generators for testing
(s/def ::generated-page
  (s/with-gen ::page
    #(s/gen #{:id "test-page"
              :title "Test Page"
              :order 1
              :body [[:h1 {:id "test" :text "Test"}]
                     [:p "Test content"]]})))

;; Build validation functions
(defn validate-build-step [step-name data spec]
  (if (s/valid? spec data)
    {:status :success :step step-name :data data}
    {:status :error 
     :step step-name 
     :errors (s/explain-data spec data)}))

(defn validate-markdown-parsing [pages]
  (validate-build-step "markdown-parsing" pages (s/coll-of ::page)))

(defn validate-sitemap-generation [sitemap]
  (validate-build-step "sitemap-generation" sitemap ::sitemap))

(defn validate-nav-generation [nav-graph]
  (validate-build-step "nav-generation" nav-graph ::nav-graph))

(defn validate-search-generation [search-index]
  (validate-build-step "search-generation" search-index ::search-index))
