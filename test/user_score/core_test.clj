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
    
(deftest ordena-lista-de-palavras-test
  (testing "Se lista ['FOO' 'BAR'] entao ['BAR' 'FOO']"
     (is (= ["BAR" "FOO"] (ordena-lista-de-palavras ["FOO" "BAR"]) ))))
     
(deftest lista-valor-palavra-test
  (testing "Se lista ['AA'] entao 2"
    (is (= [2] (lista-valor-palavras ["AA"]))))
  (testing "Se lista ['AA' 'AA'] entao [2 4]"
    (is (= [2, 4] (lista-valor-palavras ["AA" "AA"])))))
      
(deftest soma-tudo-test
  (testing "Soma de ['AA' 'AA'] eh 2+4==6"
    (is (= 6 (soma-tudo ["AA" "AA"])))))