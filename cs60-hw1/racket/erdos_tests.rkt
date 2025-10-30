#lang racket

(require rackunit)       ; load the testing framework
(require "erdos.rkt")    ; load your definitions

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Testing erdos
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; student tests
(check-equal? (erdos 10) 5)
(check-equal? (erdos 9) 28) 

; provided tests
(check-equal? (erdos 84) 42)
(check-equal? (erdos 85) 256)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Testing erdos-count
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; student tests
(check-equal? (erdos-count 1) 0)
(check-equal? (erdos-count 8) 3)
(check-equal? (erdos-count 6) 8)

; provided tests
(check-equal? (erdos-count 26) 10)
(check-equal? (erdos-count 27) 111)
