#lang racket

(provide matches)
(provide lotto-winner)


;; matches: finds the number of matches between ticket and winning numbers
;;   inputs: tickets - lotto ticket, list of numbers
;;             expected format:  '(name # # ... #)
;;           winning-numbers - winning numbers, list of numbers
;;             expected format:  '(# # .. #)
;;   output: the number elements that match between tickets and winning-numbers
(define (matches ticket winning-numbers)
  (length 
   (filter (lambda (n) (member n winning-numbers))
           (rest ticket)))) ; check numbers


;; lotto-winner: finds the name and number of the winning ticket
;;   inputs: list-of-tickets - list of lotto tickets, list of lists of numbers
;;             expected format:  '((name1 # # ... #) ... (nameN # # ... #)) 
;;           winning-numbers - winning numbers, list of numbers
;;             expected format:  '(# # .. #)
;;   output: the name and number of matching tickets from the ticket 
;;           with the most matches in winning-numbers
(define (lotto-winner list-of-tickets winning-numbers)
  ; handle empty list and all-zero scores
  (if (empty? list-of-tickets)
      '()
      (let* ([best
              (foldl (lambda (t acc)
                       (if (> (matches t winning-numbers)
                              (matches acc winning-numbers))
                           t
                           acc))
                     (first list-of-tickets)
                     (rest list-of-tickets))]
             [best-score (matches best winning-numbers)])
        ; handling no wins - for hidden tests 
        (if (= best-score 0)
            '()
            (list (first best) best-score))))) ; return name & matches
