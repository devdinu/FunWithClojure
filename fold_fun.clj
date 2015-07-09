(defn fold [f seed lst]
     (if (empty? lst) seed 
         (f (first lst) 
            (fold f seed (rest lst))
            )
     )
)

;; Syntatically improved code 
(defn sumwithseed [lst seed]
  (if (empty? lst) seed 
      (+ (first lst) (sumwithseed (rest lst) seed))
  )
)

(defn sumrec [lst]
  (if (empty? lst) 0
      (+ (first lst) (sumrec (rest lst)))
  )
)

(defn fsum [sum lst]
  (if (empty? lst) 0 (sum (first lst) (fsum sum (rest lst))))
)


;; Data

(def intlst '(1 2 3 4 5))
(def floatlst '(1.0 2.0 5.0))


;; Utility Functions or Functions to use as lambdas
(defn add [a b] (+ a b))

(defn mycount [a b] 
  (+ b 1)
)


(defn sum [lst] (fold + 0 lst))
(defn prod [lst] (fold * 1 lst))


(println (sum intlst))
(println (sum floatlst))
(println (prod intlst))
(println (prod floatlst))

(println (sumwithseed intlst 0))
(println (fold add 0 intlst))




(println (fold mycount 0 intlst))
