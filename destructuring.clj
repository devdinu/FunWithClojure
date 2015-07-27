(ns desttructuring
  (:use clojure.test))

(defn is-same-line? [cord1 cord2]
  (let [[x1 y1] cord1
        [x2 y2] cord2]
    (= x1 x2)))



(def cord1 [1 10])
(def cord2 [1 20])
(def cord3 [10 10])




(is (is-same-line? cord1 cord2))
(is (not (is-same-line? cord1 cord3)))
