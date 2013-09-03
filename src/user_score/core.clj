(ns user-score.core)

(def peso-base (dec (int \A)))

(defn letra->peso [letra]
  (- (int letra) peso-base))

(defn calcula-peso-palavra
  [palavra]
  (reduce + (map letra->peso palavra)))