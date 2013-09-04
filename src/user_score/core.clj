(ns user-score.core)

(defn- letra->peso [letra]
  (let [peso-base (dec (int \A))]
    (- (int letra) peso-base)))

(defn calcula-peso-palavra [palavra]
  (reduce + (map letra->peso palavra)))

(defn peso-ponderado [posicao palavra]
  (* (calcula-peso-palavra palavra) (inc posicao)))

(defn soma-tudo [palavras]
  (let [lista-valor-palavras (map-indexed peso-ponderado palavras)] 
    (reduce + lista-valor-palavras)))

(defn resolve-problema [palavras]
  (soma-tudo (sort palavras)))