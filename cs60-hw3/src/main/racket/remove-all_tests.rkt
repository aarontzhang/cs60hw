#lang racket

(require rackunit)
(require "remove-all.rkt")

; student tests
; remove nothing 
(check-equal? (remove-all 0 '(1 1 1 1 1)) 
              '(1 1 1 1 1))
; remove eberything 
(check-equal? (remove-all 1 '(1 1 1 1 1))
              '())


; provided tests
(check-equal? (remove-all "i" '("a" "l" "i" "i" "i" "e" "n"))
              '("a" "l" "e" "n"))
(check-equal? (remove-all "i" '( ("a" "l" "i") "i" "i" "e" "n"))
              '(("a" "l" "i") "e" "n"))
(check-equal? (remove-all 0 '(1 0 1 0 1 0))
              '(1 1 1))
