


(:= (cons (: x (: y
        (: i (if (= i 0) (x y))))))

(:= (car (: z (z 0)))
(:= (cdr (: z (z 1)))

(:= (list (: self (: x (: y
        (if (= y 0) ((cons y x)
                (self self (cons y x))))))))
 
(:= ([] (list list))
 
(:= (.first 0)
(:= (.second 1)


 (([] 1 2 3 4 0) .second .second .first)
 
)))))))


















