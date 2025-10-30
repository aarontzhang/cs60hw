#lang racket

; make public
(provide count1bits)

;; count1bits: the "count1bits" function
;;   input: positive integer, N
;;   output: # of 1s that appear in the binary representation of N
;;
(define (count1bits N)
  ; base case (return 0)
  (if (equal? N 0)
      0
      ; add 1 if odd (rightmost is 1) 
      (+ (if (odd? N) 1 0)
         ; divide by 2 to shift over 
         (count1bits (quotient N 2)))))
  
  
  