#lang racket

(provide indivisible)


;; indivisible: Takes input of e and L, and returns all elements in L not divisible by e
;;   input:  e, L - List of integers (L) and divisor (e)
;;   output: All elements in L not divisible by e
(define (indivisible e L)
  ; lambda function checking if (L[i] % e != 0)
  (filter (lambda (i) (not (equal? 0 (modulo i e)))) L))

