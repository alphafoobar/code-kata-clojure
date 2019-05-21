(ns kata02-binary-search.core
  (:require [clojure.tools.logging :as log])
  (:gen-class))

(defn chop_worker
  "I use a binary search algorithm to find the requested value."
  [key array low high length]
  (if (or (< high low) (>= low length))
    nil
    (let [mid (quot (+ low high) 2) value (array mid)]
      (cond
        (= value key) mid
        (< value key) (chop_worker key array (inc mid) high length)
        (> value key) (chop_worker key array low (dec mid) length)
        )
      )
    )
  )

;Some references:
;- Clojure guards: https://shybovycha.github.io/2016/12/21/clojure-guards.html
;- The `recur` keyword for tail recursion: https://clojurebridge.org/community-docs/docs/clojure/recur/
(defn chop
  "I use a binary search algorithm to find the requested value."
  [key array]
  (let [length (count array)]
    (if (= 0 length)
      nil
      (chop_worker key array 0 length length))
    )
  )
