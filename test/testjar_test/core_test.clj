(ns testjar-test.core-test
  (:require [clojure.test :refer :all]
            [puppetlabs.kitchensink.core :as ks]
            [puppetlabs.kitchensink.testutils :as ks-testutils]))


(deftest a-test
  (ks-testutils/with-no-jvm-shutdown-hooks
    (testing "testing!"
      (ks/some-pred->> map? 1
                    (* 2)
                    (assoc {} :a))
      (is (= 1 1)))))
