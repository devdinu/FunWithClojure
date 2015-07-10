(def >> (fn [val] (int (/ val 2)) ))

(defn isodd? [n] (= (mod n 2) 1))

(defn getresult [base p result]
  (if (isodd? p) (* result base) result)
)

(def squaremod (fn [n m] (mod (* n n) m) ))

(defn getval [base exp m result]
  (if (zero? exp) result
      (getval (squaremod base m)  (>> exp) m (getresult base exp result) )
  )
)

(defn sumr [x]
   (if (zero? x) 0 (+ x (sumr (dec x))))
)

(defn modpow [n p m]
  (cond (zero? n) 0 :else (getval n p m 1))
)

(defn exponentiation_recursive [x p]
  (if (zero? p) 1 (* x (exponentiation_recursive x (dec p))) )
)

(println (sumr 5) )
(println (modpow 2 1 10000))
(println (modpow 2 8 10000))
(println (exponentiation_recursive 2 8))
