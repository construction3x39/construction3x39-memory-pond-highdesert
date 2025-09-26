(ns site.parser
  (:require [clojure.string :as str]))

(defn- slugify [s]
  (-> s str/lower-case
      (str/replace #"[^a-z0-9\s-]" "")
      (str/replace #"\s+" "-")
      (str/replace #"-+" "-")))

(defn- heading [lvl txt]
  (let [id (slugify txt)]
    [(keyword (str "h" lvl)) {:id id :text txt}]))

(defn md->ast [s]
  (->> (str/split s #"\n\n")
       (map (fn [blk]
              (cond
                (re-matches #"^# .+" blk)   (heading 1 (subs blk 2))
                (re-matches #"^## .+" blk)  (heading 2 (subs blk 3))
                (re-matches #"^### .+" blk) (heading 3 (subs blk 4))
                :else [:p blk])))))
