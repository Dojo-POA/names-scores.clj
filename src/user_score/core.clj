(ns user-score.core)

(def peso-base (dec (int \A)))

(defn letra->peso [letra]
  (- (int letra) peso-base))

(defn calcula-peso-palavra [palavra]
  (reduce + (map letra->peso palavra)))

(defn peso-ponderado [posicao palavra]
  (* (calcula-peso-palavra palavra) (inc posicao)))

(defn lista-valor-palavras [lista]
  (map-indexed peso-ponderado lista))

(defn soma-tudo [palavras]
  (reduce + (lista-valor-palavras palavras)))

(defn resolve-problema [palavras]
  (soma-tudo (sort palavras)))