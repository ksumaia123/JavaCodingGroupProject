package ifElseStatement;

import java.util.Scanner;

public class IfElseStatementPractice {
   /* 1.	A school has following rules for grading system:
    a. Below 25 - F
    b. 26 to 45 - E
    c. 46 to 50 - D
    d. 51 to 60 - C
    e. 61 to 80 - B
    f. Above 80 - A
    Take a number as variable or from User and print the corresponding grade.

   Self Note:
   && (Logical Operator)The Logical operator && is known as the AND operator.
    In Java (and many other programming languages), it is used to evaluate whether both conditions on either side of the operator are true.
    If both conditions are true, the overall expression evaluates to true.
    If either or both conditions are false, the expression evaluates to false.

  = (Assignment Operator) Purpose: Used to assign a value to a variable.
  == (Equality Operator) Purpose: Used to compare two values to check if they are equal.

  (Scanner class) is used to read files from the users and from console.
   */

    public void gradeSystem(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade");
        int mark = scan.nextInt();

        if (mark<25){
            System.out.println("Grade F");
        }
        else if (mark>=26 && mark<=45) {
            System.out.println("Grade E");
        }
        else if (mark>=46 && mark<=50) {
            System.out.println("Grade D");
        }
        else if (mark>=51 && mark<=60) {
            System.out.println("Grade C");
        }
        else if (mark>=61 && mark<=80) {
            System.out.println("Grade B");
        }
        else if (mark>=80) {
            System.out.println("Grade A");
        }
        else {
            System.out.println("This is invalid mark");
        }
    }

    public static void main(String[] args) {
IfElseStatementPractice obj = new IfElseStatementPractice();
obj.gradeSystem();
    }
}
