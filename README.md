# (Nano (' programming language))
(-- "A new tiny programming language")

      ______   ___   ____   _______
      / _  |  / _ | / _  | / __   /
     / / | | / __ |/ / | |/ /_ / /
    / /  | |/_/ |_/ /  | |\ ____/    by Comcx

## (> Getting started!
### (Quick use
   - **Step 0:**  (Pre-installs: make sure you have installed JDK whose version >= 1.8)  
   - **Step 1:**  `git clone https://github.com/Comcx/Nano`  
   - **Step 2:**  (input: `java -jar nano.jar`)  
   - **Step 3:**  Enjoy it!  
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
  
  - (1 Church Numeral supported!)  
    Church numeral can be used to replace loops:
    0  is defined as `(:= (zero (: f (: x x))))`  
    +1 is defined as `(:= (+1 (: f (: n (: x (f (n f x)))))))`  
    i is defined as (+1 0)  
    2 is defined as (+1 1)  
    ...  
    n is defined as (+1 (n-1))
  **)**




