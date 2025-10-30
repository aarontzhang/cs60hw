#lang racket

(provide remove-all)

;; remove-all: removes all top-level instances of element from list
;;  inputs: element to remove, elem
;;          list to remove from, L
;;  output: list identical to L with all top-level instances of elem removed
(define (remove-all elem L)
  (cond
    ; base 
    [(empty? L) '()]
    ; lose
    [(equal? (first L) elem) (remove-all elem (rest L))]
    ; use 
    [else (cons (first L) (remove-all elem (rest L)))]))