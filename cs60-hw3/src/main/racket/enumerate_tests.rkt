#lang racket

(require rackunit)
(require "enumerate.rkt")

; student tests
(check-equal? (enumerate '(x))
              '((0 x)))
              
(check-equal? (enumerate '((1 2) (3 4)))
              '((0 (1 2)) (1 (3 4))))


; provided tests 
(check-equal? (enumerate '(jan feb mar apr)) 
  '((0 jan) (1 feb) (2 mar) (3 apr)))

(check-equal? (enumerate '(0 I II III IV V VI)) 
                         '((0 0) (1 I) (2 II) (3 III) (4 IV) (5 V) (6 VI)))

(check-equal? (enumerate '())  '())
