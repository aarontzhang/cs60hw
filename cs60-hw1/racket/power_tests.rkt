#lang racket

; import 
(require rackunit)
(require "power.rkt")

; provided tests
(check-equal? (power 2 10) 1024)
(check-equal? (power 42 10) 17080198121677824)

; student tests
; power
(check-equal? (power 5 0) 1)
(check-equal? (power 3 1) 3)
(check-equal? (power 4 2) 16)
;fast-power
(check-equal? (fast-power 1 100) 1)
(check-equal? (fast-power 7 4) 2401)
(check-equal? (fast-power 3 8) 6561)