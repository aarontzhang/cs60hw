#lang racket

(provide superreverse duperreverse)

; helper - remove the last term from a list
(define (remove-last L)
  (cond
    ; bases - empty or last term
    [(empty? L) '()]
    [(empty? (rest L)) '()]
    ; recurse - keep first & remove from rest
    [else (cons (first L) (remove-last (rest L)))]))

; helper - reverse a single list
(define (rev S)
  (cond
    ; base 
    [(empty? S) '()]
    ; rest - add last to new list & remove last term with helper 
    [else (cons (last S) (rev (remove-last S)))]))

; super reverse - reverse each inner list, keep outer order
(define (superreverse L)
  (cond
    ; base 
    [(empty? L) '()]
    ; rest - if first is list, reverse it, then keep scanning rest
    [else (cons (if (list? (first L)) (rev (first L)) (first L))
                (superreverse (rest L)))]))

; duper reverse - reverse outside and also inside lists
(define (duperreverse L)
  (cond
    ; base
    [(empty? L) '()]
    ; rest - add last element (if list, deep reverse it) 
    [else 
     (define x (last L))
     (cons (if (list? x) (duperreverse x) x)
           (duperreverse (remove-last L)))]))
