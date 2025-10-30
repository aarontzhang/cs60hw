#lang racket
(provide prefix? sublist?)


(define (prefix? P L)
  (cond
       ; base
       [(empty? P) #t]
       [(empty? L) #f]
       ; use 
       [(equal? (first P) (first L)) (prefix? (rest P) (rest L))]
       ; lose - auto false 
       [else #f]))

(define (sublist? S L)
  (cond
       ; base
       [(empty? S) #t]
       [(empty? L) #f]
       ; use - prefix 
       [(prefix? S L) #t]
       ; lose - call again without changing S 
       [else (sublist? S (rest L))]))
  
