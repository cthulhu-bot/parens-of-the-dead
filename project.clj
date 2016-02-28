(defproject parens-of-the-dead "0.1.0-SNAPSHOT"
  :description "A series of zombie-themed games written with Clojure and ClojureScript" 
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.228"]                 
                 [http-kit "2.1.18"]
                 [com.stuartsierra/component "0.3.1"]
                 [compojure "1.4.0"]
                 [org.clojure/google-closure-library "0.0-2029-2"]]
  :main parens-of-the-dead.system
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[lein-cljsbuild "1.1.2"]]
                   :dependencies [[reloaded.repl "0.2.1"]]
                   :source-paths ["dev"]
                   :cljsbuild {:builds [{:source-paths ["src" "dev"]
                                         :compiler {:output-to "target/classes/public/app.js"
                                                    :output-dir "target/classes/public/out"
                                                    :optimizations :none
                                                    :recompile-dependents true
                                                    :source-map true}}]}}}
  :builds {
           :main {
                  :compiler {:output-to "target/classes/public/app.js"
                             :output-dir "target/classes/public/out"
                             :optimizations :none
                             :recompile-dependents true
                             :source-map true
                             :libs ["closure-library/closure/goog/base.js"]}}})
