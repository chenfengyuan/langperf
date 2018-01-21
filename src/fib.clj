(defn fib [n]
  (if (< n 3)
    1
    (+ (fib (- n 1)) (fib (- n 2)))
  )
)
(println (fib 40) System/out)