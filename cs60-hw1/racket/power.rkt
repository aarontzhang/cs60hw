#lang racket
; make public
(provide power fast-power)

;;power: the "power" function
;;   input: base, pow
;;   output: base ^ pow
;;
(define (power base pow)
  ;base case (^0 = 1) 
  (if (equal? pow 0) 1
      ; multiply by itself, recurse calling power - 1
      (* base (power base (- pow 1)))))
      
;; fast-power: the "fast-power" function
;;   input: base, pow
;;   output: base ^ pow using fast-power:
;;     splits pow into 2, multiplying two parts together to improve efficiency
;;
(define (fast-power base pow)
  ; base case
  (if (equal? pow 0)
      1
      ;even (half * half, half = base ^ pow//2)
      (if (even? pow)
          (let ((half (fast-power base (quotient pow 2))))
            (* half half))
          ; odd (peel layer off, base * (recurse w power-1) making it even (above^)))
          (* base (fast-power base (- pow 1))))))

; compare
(time (power 2 100000) (void))
(time (fast-power 2 100000) (void))

          