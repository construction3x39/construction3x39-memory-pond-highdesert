#!/usr/bin/env bb
(ns serve
  (:require [org.httpkit.server :as http]
            [clojure.java.io :as io]))

(def root (or (System/getenv "SITE_ROOT") "web/build"))

(defn app [req]
  (let [path (or (:uri req) "/index.html")
        file (io/file root (if (= "/" path) "index.html" (subs path 1)))]
    (if (.exists file)
      {:status 200 :headers {} :body (io/input-stream file)}
      {:status 404 :headers {} :body "Not found"})))

(defn -main []
  (println "Serving" root "on http://localhost:8080")
  (http/run-server app {:port 8080})
  @(promise))

(-main)
