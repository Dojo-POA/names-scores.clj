(ns user-score.core-test
  (:require [clojure.test :refer :all]
            [user-score.core :refer :all]))

(deftest calcula-peso-palavra-test
  (testing "Se palavra A entao valor eh 1"
    (is (= 1 (calcula-peso-palavra "A"))))
  
  (testing "Se palavra B entao valor eh 2"
    (is (= 2 (calcula-peso-palavra "B"))))
  
  (testing "Se palavra AB entao valor eh 3"
    (is (= 3 (calcula-peso-palavra "AB"))))
    
  (testing "Se palavra vazia entao valor eh 0"
      (is (= 0 (calcula-peso-palavra "")))))
      
(deftest soma-tudo-test
  (testing "Soma de ['AA' 'AA'] eh 2+4==6"
    (is (= 6 (soma-tudo ["AA" "AA"])))))

(deftest resolve-problema-test
  (testing "['B' 'A'] eh 1+4==5"
    (is (= 5 (resolve-problema ["B" "A"])))))