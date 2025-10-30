#lang racket

(provide enumerate)

(define (enumerate L)
  (define (listMaker L i)
    (cond
      ; base - if L empty
      [(empty? L) '()]
      ; recurse - add index & L[1] + call rest
      [else (cons (list i (first L))(listMaker (rest L) (+ i 1)))]))
  
  (listMaker L 0))
