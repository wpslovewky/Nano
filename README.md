# (Nano (' programming language))
(-- "A new tiny programming language which pursues minimalism")

      ______  ___   ____   _______
      / _  | / _ | / _  | / __   /
     / / | |/ __ |/ / | |/ /_ / /
    / /  | /_/ |_/ /  | |\ ____/    by Comcx

## (> Getting started!
### (Quick use
   - **Step 0:**  (Pre-installs: make sure you have installed JDK whose version >= 1.8)  
   - **Step 1:**  `git clone https://github.com/Comcx/Nano` or just download from web  
   - **Step 2:**  (if (use repl) ((commandInput: `xxx$ java -jar nano.jar`) (commandInput: `xxx$ java -jar nano.jar -l <filename>`)))  
   - **Step 3:**  Enjoy it! (; "input ':q' to quit repl")  
   **)**  

## (> Grammar
  
- **(Overview:**  
  
  Like Lisp, Nano use lists to express any expression. However, Nano is curry supported by default.  
  For example:    
  `(+ 1 2)`  
  will be parsed as   
  `((+ 1) 2)`  
  **)**<br><br>
  
  
- **(:= Bindings:**  
  
  `(:= (<name> <value>) expression)`  
  **)**<br><br>
  
  
- **(: Lambdas:**  
  
  `(: <variable> <expression>)`  
  **)**<br><br>  
  
  
- **((+-*/) Supported atomic operators:**  
  
  `(; (' addition)       (+ a b))`  
  `(; (' substraction)   (- a b))`  
  `(; (' multiplication) (* a b))`  
  `(; (' division)       (/ a b)) `  
  `(; (' equal)          (= a b))`  
  `(; (' quote)          (' symbol)`  
  **)**<br><br>
  
  
- **(:) Interesting features:**  
  
  - ***(1 Church Numeral supported!)***   
  
    Church numeral can be used to replace loops:  
    ***0*** &nbsp; is defined as `(:= (zero (: f (: x x))))`  
    ***+1*** is defined as `(:= (+1 (: n (: f (: x (f (n f x)))))))`  
    ***1*** &nbsp; is defined as `(+1 0)`  
    ***2*** &nbsp; is defined as `(+1 1)`  
    ...  
    ***n*** &nbsp; is defined as `(+1 (n-1))`  
  **)**
    
  - ***???***


## (> Example  
  
  ```
  1 (:= (cons (: x (: y
  2         (: i (if (= i 0) (x y))))))
  3         
  4 (:= (car (: z (z 0)))
  5 (:= (cdr (: z (z 1)))
  6 
  7 (:= (list (: self (: x (: y
  8         (if (= y 0) ((cons y x)
  9                 (self self (cons y x))))))))
 10                 
 11 (:= ([] (list list))
 12  
 13 (:= (.first 0)
 14 (:= (.second 1)
 15 
 16 
 17  (([] 1 2 3 4 0) .second .second .first)
 18 
 19 )))))))
```


