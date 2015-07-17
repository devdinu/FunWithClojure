(defn filter-words [words length] 
  (filter #(> (count %1) length) words))

"equivalent to 
  (filter (fn [word] (> (count word) > length))
"

(def word-list '("a" "ba" "boxer" "kingdom" "ball" "sample"))

(filter-words word-list 4)
