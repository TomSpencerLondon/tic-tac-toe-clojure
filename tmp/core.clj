(ns temp.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet"
  [& args]
  (println "Bye, world!")
  
  9)
(defn leap-year?
  [year]
  (and (zero? (mod year 4))
       (or (zero? (mod year 400))
           (not (zero? (mod year 100))))))
(leap-year? 1984)

(comment
  (+ 1 1)
  (-main)
  (map + [1 2 3 4])
  ())
