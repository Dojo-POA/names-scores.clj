(ns user-score.core-test
  (:require [clojure.test :refer :all]
            [user-score.core :refer :all]))

(deftest calcula-peso-palavra-test
  (testing "Se palavra A entao valor eh um"
  (is (= 1 (calcula-peso-palavra "A")))
  ))