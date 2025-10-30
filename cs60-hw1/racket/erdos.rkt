#lang racket

;; Two functions will be treated as publicly accessible
;; (so that we can test them)
(provide erdos erdos-count)

;; erdos: the "erdos" function
;;   input: a positive integer, N
;;   output: 3N+1, if N is odd
;;           N/2, if N is even
(define (erdos N)
  ;even
  (if (equal? (modulo N 2) 0)
    (quotient N 2)
  ;odd 
    (+ (* 3 N) 1)))

  

; erdos-count: the "erdos_count" function 
;   input: a positive integer, N
;   output: the smallest number of times erdos is called in order for N to equal 1. 
(define (erdos-count N)
  (if (equal? N 1) 0
      (+ 1 (erdos-count (erdos N)))))
