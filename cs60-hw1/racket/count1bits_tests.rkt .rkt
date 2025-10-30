#lang racket

; get count1bits
(require rackunit)
(require "count1bits.rkt")

; provided tests
(check-equal? (count1bits 6) 2)
(check-equal? (count1bits 7) 3)
(check-equal? (count1bits 42) 3)

; student tests
(check-equal? (count1bits 1) 1)     
(check-equal? (count1bits 2) 1)     
(check-equal? (count1bits 3) 2)     
(check-equal? (count1bits 8) 1)    