(defn get-int [] (read-string (read-line)))

(def mod-value 1000000007)

(def >> (fn [val] (int (/ val 2))))

(defn isodd? [n] (= (mod n 2) 1))

(def prod-mod (fn [x y modvalue] (mod (* x y) modvalue)))

(def square-mod (fn [n modvalue] (prod-mod n n modvalue)))

(defn get-result [base p result] (if (isodd? p) (prod-mod result base mod-value) result) )

(defn get-val [base exp m result]
  (if (zero? exp) result
      (get-val (square-mod base m)  (>> exp) m (get-result base exp result))))

(defn mod-pow [n p m] (if (zero? n) 0 (get-val n p m 1)))

(defn get-ways-to-collect [] (mod-pow 2 (dec (get-int)) mod-value))

(doseq [n (repeatedly (get-int) (fn [] (get-ways-to-collect)))] (println n))