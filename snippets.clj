;; basic printing
(println (+ 2 3) "and" (/ 10 2))
(println  (* 10 10) "and" (- 100 0))
(println "Hello, world!")

;; declaring variables
;; declaring using the 'def' keyword, 'defn' is reserved for functions
;; 
(def user "Bob")
(def ten (+ 5 5))
(def nums '[1, 2, 3, 4, 5])

;; printing variables
(println "printing user:" user)
(println "printing ten:" ten)
(println "printing nums:" nums)


;; functions
(defn greet [person]
  (str "Hello ", person "!"))

(defn birthday [day]
  (str "You are ", day " years old."))

(defn square [a b]
  (* a b))

;; call functions
(println (greet user))
(println (birthday ten))
(println (square ten 11))

