(ns tic-tac-toe.position)

(def dim 3)
(def size (* dim dim))

(def init-position {:board (vec (replicate size '-)) :turn 'x})
(defn move [{:keys [board turn]} idx]
  {:board (assoc board idx turn) :turn (if (= 'x turn) 'o 'x)})
(defn possible-moves [{:keys [board]}]
  (keep-indexed #(if (= '- %2) %1) board))
(defn win? [{:keys [board]} turn]

)

