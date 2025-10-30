#lang racket

(provide choose)

;; choose: Determines the number of ways to choose k unordered items
;;         from a list of n
;;
;; Called "n choose k" in combinatorics:
;; (n choose k) = n! / (k!(n-k)!), where ! is the factorial operation
;;
;; For example, (4 choose 2) = 6 because there are six ways to choose
;; two dwarves from a list of four (Happy, Sleepy, Grumpy, Dopey):
;; 1: (Happy, Sleepy) 2: (Happy, Grumpy) 3: (Happy, Dopey)
;; 4: (Sleepy, Grumpy) 5: (Sleepy, Dopey) 6: (Grumpy, Dopey)
;;
;; This is a recursive implementation of "choose"
;;
;; inputs: n, positive integer indicating # of items in list
;;         k, nonnegative integer <= n indicating # of items to choose
;; output: (n choose k)
(define (choose n k)
  (if (> n k)
      (/ (* (choose (- n 1) k) n) (- n k))
      1))
