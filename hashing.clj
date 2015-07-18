(use ['clojure.string :only '(split)])

(def tcases (read-string (read-line)))
(def hashvals (ref {}))
(def mod-value 10)

(defn hash-value [x] (mod x mod-value))

(defn get-list []
  (read-string (read-line))
  (map read-string (split (read-line) #" ")))

(defn update-hash [x]
  (dosync 
   (alter hashvals 
          assoc-in [(hash-value x)] 
          (inc (@hashvals (hash-value x) 0)))))

(defn process-hashing []
  (map update-hash (get-list))
  (print (count (filter #(> (@hashvals %) 1) (keys @hashvals)))))

(repeatedly tcases process-hashing)
