(ns project-euler
  (import [java.util GregorianCalendar]))

(def calendar (new GregorianCalendar))

;; Elapsed time: 119.212367 msecs
(defn euler-019 []
  (reduce +
          (for [year (range 1901 (inc 2000)) month (range 1 (inc 12))]
            (do
              (.set calendar GregorianCalendar/YEAR year)
              (.set calendar GregorianCalendar/MONTH month)
              (.set calendar GregorianCalendar/DAY_OF_MONTH 1)
              (if (= GregorianCalendar/SUNDAY 
                     (.get calendar GregorianCalendar/DAY_OF_WEEK)) 1 0)))))