(ns user-score.core)

(defn calcula-peso-palavra
  [palavra]
  (reduce
    (fn [soma letra] 
      (+
        soma
        (- (int letra) 64)
      )
    )
    0
    palavra
  )
)
  
  
  


