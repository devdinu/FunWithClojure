(ns indexof-any-impl 
  (:use clojure.test))

(defn exists-in [letter pattern]
;;;  (println "testing " letter " in " pattern)
  (if (empty? pattern) false 
      (if (= letter (first pattern)) true
    (recur letter (rest pattern)))))

(defn index-of [str-input pat]
  (map (fn [c] (if (exists c pat) c -1)) (seq str-input)))

(defn exists [c pat] (exists-in c (seq pat)))

(is (exists \a "abc"))
(is (exists \a "bac"))
(is (not (exists \a "some")))

(print (index-of "some" "o")) 
(is ())
