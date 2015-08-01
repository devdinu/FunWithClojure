(ns play-loop (:use clojure.test))

;;; recur - calls back to the function 
(defn get-sum [max] 
  (loop [sum 0 i 0] 
    (if (> i max) sum
        (recur (+ sum i) (inc i)))))

(is (= (get-sum 10) 55))
(is (= (get-sum 1) 1))
(is (not (< (get-sum 10) 45)))
