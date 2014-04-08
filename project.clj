(defproject match-bug "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.match "0.2.0"]]
  :profiles {:uberjar {:aot [match-bug.core]}})
