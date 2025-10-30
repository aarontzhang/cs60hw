#lang racket

(provide superreverse)


;; superreverse: Takes input L and returns top-level reversal of L 
;;   input:  L (List of lists) 
;;   output: Top-level reversal of L 
(define (superreverse L)
  (map reverse L))

