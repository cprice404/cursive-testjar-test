(defproject testjar-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [puppetlabs/kitchensink "1.0.0"]]

  :profiles {:dev {:dependencies [[puppetlabs/kitchensink "1.0.0" :classifier "test"]]}})
