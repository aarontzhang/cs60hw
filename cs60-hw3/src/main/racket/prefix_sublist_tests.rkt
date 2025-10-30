#lang racket

(require rackunit)
(require "prefix_sublist.rkt")

; student tests (prefix)
(check-true  (prefix? '(1 2 3) '(1 2 3)))
(check-false (prefix? '(1 2) '(1)))

; provided tests (prefix) 
(check-true  (prefix? '()    '(s p a m)))
(check-true  (prefix? '(s p) '(s p a m)))
(check-false (prefix? '(s m) '(s p a m)))
(check-false (prefix? '(p a) '(s p a m)))

; student tests (sublist)
(check-true  (sublist? '(3 4) '(1 2 3 4)))
(check-false (sublist? '(1 3) '(1 2 3 4)))

; provided tests (sublist)
(check-true  (sublist? '()    '(s p a m)))
(check-true  (sublist? '(s p) '(s p a m)))
(check-false (sublist? '(s m) '(s p a m)))
(check-true  (sublist? '(p a) '(s p a m)))
