(def >> (fn [val] (int (/ val 2)) ))

(defn isodd? [n] (= (mod n 2) 1))

(defn getresult [base p result]
  (if (isodd? (>> p)) (* result base) result)
)

(def squaremod (fn [n m] (mod (* n n) m) ))

(defn getval [base exp m result]
  (if (zero? exp) 1
      (getval (squaremod base m)  (>> exp) m (getresult base exp result) )
  )
  (println base exp m result "..... at getval")
)

(defn sumr [x]
  (println "sum " x)
  (if (<= x 0) 0
      (+ 0 (sumr (- x 1)))
      )
)

(defn modpow [n p m]
	(cond
		(= n 0) 0
		:else (print (getval n p m 1) "is ret") 
	)
)

(defn exponentiation_recursive [^long x p]
  (println x p)
  (cond
		(= p 0) 1
	       :else (exponentiation_recursive (* x x) (- p 1))
  )
)


(println (sumr 5) )
(println (modpow 2 1 10000))
(println (modpow 2 8 10000)) 
;;; (println (exponentiation_recursive 2 8))
