#lang racket

(provide subbag? best-word)

(require rackunit)

; subbag
(define (subbag? S B)
  (cond
    ; base 
    [(empty? S) #t]
    [(empty? B) #f]

    ; check if S[0] in B, if True, recurse, else False
    [(member (first S) B)(subbag? (rest S) (remove (first S) B))]
    [else #f]))


(define scrabble-tile-bag
  '((#\a 1 9) (#\b 3 2) (#\c 3 2) (#\d 2 4) (#\e 1 12)
    (#\f 4 2) (#\g 2 3) (#\h 4 2) (#\i 1 9) (#\j 8 1)
    (#\k 5 1) (#\l 1 4) (#\m 3 2) (#\n 1 6) (#\o 1 8)
    (#\p 3 2) (#\q 10 1) (#\r 1 6) (#\s 1 4) (#\t 1 6)
    (#\u 1 4) (#\v 4 2) (#\w 4 2) (#\x 8 1) (#\y 4 2)
    (#\z 10 1) (#\_ 0 2))) 

; returns score for single character
(define (score-letter ch)
  (define entry (assoc ch scrabble-tile-bag))
  (if entry (second entry) 0))

; sums letter scores
(define (score-word s)
  (define chars (string->list s))
  (define (sum L)
    (cond
      [(empty? L) 0]
      [else (+ (score-letter (first L)) (sum (rest L)))]))
  (sum chars))

; check if word can be made
(define (can-make? rack word)
  (subbag? (string->list word) (string->list rack)))

; returns best word best score
(define (best-word rack WL)
  (define (loop words best) ; best is word score
    (cond
      ; base
      [(empty? words) best]
      ; recurse - update best if current word has higher score
      [else
       (define w (first words))
       (define best*
         (if (can-make? rack w)
             (let ([sc (score-word w)])
               (if (> sc (second best)) (list w sc) best))
             best))
       (loop (rest words) best*)]))
  (loop WL '("" 0)))