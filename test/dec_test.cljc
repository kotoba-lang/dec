(ns dec-test
  (:require [clojure.test :refer [deftest is testing]]
            [dec]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? dec))))
