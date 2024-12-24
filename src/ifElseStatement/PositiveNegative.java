package ifElseStatement;

import java.util.Scanner;

/*
5. Write an if-else statement that checks if a number is positive, negative, or zero.
Exercise:
Take an input number using a variable or from User.
Print "Positive" if the number is greater than zero.
Print "Negative" if the number is less than zero.
Print "Zero" if the number is exactly zero.

 */

public class PositiveNegative {
    double num = 5.634;   //use double for decimal number and int used for the whole number

    public void number(){
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public void number1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        double num1=sc.nextDouble();
        if (num1 > 0) {
            System.out.println("Positive");
        } else if (num1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        PositiveNegative obj= new PositiveNegative();
 obj.number();
  //      obj.number1();
    }
}




