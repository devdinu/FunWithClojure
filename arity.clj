(defn add
   "Multiple Arguments, order doesnt' actually  matter" 
 ([] "You have to provide atlease one argument")
  ([x y] (+ x y) )
  ([x y z] (+ x y z))
  ([x] "only one :) ")
)

(comment (defn mul-arity
  "   Can't have fixed arity function with more params than variadic
   function"
  ([first] (print "one" first))
  ([first & rest] (println "Testing.. " rest))
  ([first sec third] (println first sec third))))

(add)
(add 1)
(add 1 2) 

;;; ambigous (mul-arity 1 2 3)
