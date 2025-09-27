(ns aspiringly-sacred.specs
  "🌙 Aspiringly-Sacred Technology Clojure Specs
   Comprehensive specification system for awareness-serving development"
  (:require [clojure.spec.alpha :as s]
            [clojure.spec.gen.alpha :as gen]
            [clojure.spec.test.alpha :as stest]))

;; 🎯 Core Aspiringly-Sacred Technology Specs

;; Repository structure specifications
(s/def ::repository-name 
  (s/and string? 
         #(re-matches #"construction3x39-memory-[a-z-]+" %)))

(s/def ::branch-name 
  #{"moon-terroir" "dev-unstable"})

(s/def ::commit-pattern
  (s/and string?
         #(re-matches #"butterflyae4817: 1\d{4}-\d{2}-\d{2}--\d{2}thhouse\d{2}--moon-[a-z]+--santafenmmountain" %)))

;; Documentation specifications
(s/def ::markdown-content
  (s/and string?
         #(> (count %) 10)
         #(or (re-find #"aspiringly-sacred" %)
              (re-find #"awareness development" %))))

(s/def ::voice-quality
  (s/keys :req-un [::patience ::clarity ::accessibility ::humility]))

(s/def ::patience (s/and number? #(>= % 0)))
(s/def ::clarity (s/and number? #(>= % 0)))
(s/def ::accessibility (s/and number? #(>= % 0)))
(s/def ::humility (s/and number? #(>= % 0)))

;; BB task specifications
(s/def ::bb-task-name keyword?)
(s/def ::bb-task-doc string?)
(s/def ::bb-task-deps (s/coll-of keyword?))

(s/def ::bb-task
  (s/keys :req-un [::bb-task-doc]
          :opt-un [::bb-task-deps]))

;; Nix package specifications
(s/def ::nix-package-name
  (s/and string?
         #(re-matches #"[a-zA-Z0-9_.-]+" %)))

(s/def ::nix-package-category
  #{:core :publishing :editor :security :quality :web :build :docs})

(s/def ::nix-package
  (s/keys :req-un [::nix-package-name ::nix-package-category]))

;; Archive integration specifications
(s/def ::archive-status
  #{:completely-infused :partially-integrated :needs-integration})

(s/def ::curriculum-phase
  #{:seed :sprout :stem :flower :full-moon})

;; 🧪 Specification Validation Functions

(defn validate-repository-structure [repo-data]
  "Validate repository follows aspiringly-sacred structure"
  (s/valid? ::repository-name (:name repo-data)))

(defn validate-voice-quality [content]
  "Validate content meets aspiringly-sacred voice standards"
  (let [patience-score (count (re-seq #"patient|gentle|slowly|when ready" content))
        clarity-score (count (re-seq #"clear|simple|understand" content))
        accessibility-score (count (re-seq #"accessible|welcome|beginner" content))
        humility-score (count (re-seq #"aspiringly|learning|student|journey" content))]
    
    (s/valid? ::voice-quality 
              {:patience patience-score
               :clarity clarity-score  
               :accessibility accessibility-score
               :humility humility-score})))

(defn validate-bb-task [task-map]
  "Validate BB task follows aspiringly-sacred standards"
  (s/valid? ::bb-task task-map))

;; 🌙 Spec Testing Integration

(defn run-aspiringly-sacred-specs []
  "Run comprehensive spec validation for aspiringly-sacred development"
  (println "🧪 Running Aspiringly-Sacred Technology Specs...")
  
  ;; Test repository naming
  (let [repo-names ["construction3x39-memory-quinoa"
                    "construction3x39-memory-gnupg-config"
                    "construction3x39-memory-nvim-config"
                    "construction3x39-memory-pond-highdesert"]]
    (doseq [name repo-names]
      (if (s/valid? ::repository-name name)
        (println "✅ Repository name valid:" name)
        (println "❌ Repository name invalid:" name))))
  
  ;; Test commit pattern
  (let [commit "butterflyae4817: 12025-09-27--12thhouse12--moon-anuradha--santafenmmountain"]
    (if (s/valid? ::commit-pattern commit)
      (println "✅ Commit pattern valid")
      (println "❌ Commit pattern invalid")))
  
  (println "🌙 Aspiringly-sacred specs validation complete!"))

;; 📋 Export specifications for use in other namespaces
(comment
  "Use these specs in other aspiringly-sacred development:
   
   (require '[aspiringly-sacred.specs :as specs])
   (s/valid? ::specs/repository-name 'construction3x39-memory-example')
   (specs/validate-voice-quality markdown-content)
   (specs/run-aspiringly-sacred-specs)")

;; 🌙 Aspiringly-Sacred Technology Specifications
;; Serving awareness development through validated quality standards
