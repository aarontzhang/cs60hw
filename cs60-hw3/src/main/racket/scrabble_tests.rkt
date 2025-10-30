#lang racket

(require rackunit)
(require "scrabble.rkt")

; provided tests subbag
(check-true  (subbag? '()      '(s p a m s)) )
(check-true  (subbag? '(s s)   '(s p a m s)) )
(check-true  (subbag? '(s m)   '(s p a m s)) )
(check-true  (subbag? '(a p)   '(s p a m s)) )
(check-false (subbag? '(a m a) '(s p a m s)) )
(check-true  (subbag? '(a s)   '(s a))       )
; student tests
(check-true  (subbag? '(x) '(x y z)))
(check-false (subbag? '(y z) '(y)))

; provided tests - best word
(check-equal? (best-word "academy" '("ace" "ade" "cad" "cay" "day")) '("cay" 8))
(check-equal? (best-word "appler"  '("peal" "peel" "ape" "paper"))   '("paper" 9))
(check-equal? (best-word "paler"   '("peal" "peel" "ape" "paper"))   '("peal" 6))
(check-equal? (best-word "kwyjibo" '("ace" "ade" "cad" "cay" "day")) '("" 0))
; student tests
(check-equal? (best-word "dog" '("dog" "cat")) '("dog" 5))
(check-equal? (best-word "qz"  '("z" "xx")) '("z" 10))

