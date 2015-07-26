(defn add
   "Multiple Arguments, order doesnt' actually  matter" 
 ([] "You have to provide atlease one argument")
  ([x y] (+ x y) )
  ([x y z] (+ x y z))
  ([x] "only one :) ")
)

(defn test
  ([first] (print "one" first))
  ([first & rest] (println "Testing.. " rest)))

(add)
(add 1)
(add 1 2) 


(test 1)
