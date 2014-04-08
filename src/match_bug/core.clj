(ns match-bug.core
  (require
   [clojure.core.match :refer [match]]))

(let [x 4 y 6 z 9]
  (match [x y z]
    [(:or 1 2 3) _ _] :a0
    [4 (:or 5 6 7) _] :a1
    :else nil))
