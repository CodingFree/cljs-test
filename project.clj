(defproject test "0.1.0-SNAPSHOT"
  :description "Just a test"
  :url "http://githut.com/CodingFree/cljs-test"
  :license {:name "Mozilla Public License, version 2.0"
            :url "https://www.mozilla.org/en-US/MPL/2.0/"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot test.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
