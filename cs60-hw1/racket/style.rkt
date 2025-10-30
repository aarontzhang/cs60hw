#lang racket

(define(judgeWeather temp)
    (cond 
        [(> temp 75) "hot"] 
        [(< temp 65) "cold"]
        [else "ok"]))
        