(ns tic-tac-toe.position-spec
  (:require [speclj.core :refer :all]
            [tic-tac-toe.position :refer :all]))

(describe "tic-tac-toe.position"
  (context "init-position"
    (it "should create a new position"
     (should= {:board '[- - -, - - -, - - -] :turn 'x} init-position))))

(run-specs)
