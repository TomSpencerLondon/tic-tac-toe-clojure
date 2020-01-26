(ns tic-tac-toe.position-spec
  (:require [speclj.core :refer :all]
            [tic-tac-toe.position :refer :all]))

(describe "tic-tac-toe.position"
  (context "init-position"
    (it "should create a new position"
     (should= {:board '[- - -, - - -, - - -] :turn 'x} init-position)))
  (context "move"
    (it "should make a move"
      (should= {:board '[x - -, - - -, - - -] :turn 'o} (move init-position 0))))
  (context "possible-moves"
    (it "should list possible moves for a position"
      (should= [2,3,6,7,8] (possible-moves {:board '[x x -, - o o, - - -]})))
  )
  (context "win?"
    (it "should determine no win"
      (should-not (win? init-position 'x))))
)
(run-specs)
