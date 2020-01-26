(ns tic-tac-toe.position)

(def dim 3)
(def size (* dim dim))

(def init-position {:board (vec (replicate size '-)) :turn 'x})
