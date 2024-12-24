package ifElseStatement;

import java.util.Scanner;

public class Divisible {

    /*
    3. Write a program that checks if a number is divisible by 5, 3, or both.
Exercise:
Take a number using a variable or from user
If the number is divisible by both 5 and 3, print "Divisible by 5 and 3."
If it is only divisible by 5, print "Divisible by 5."
If it is only divisible by 3, print "Divisible by 3."
If neither, print "Not divisible by 5 or 3."
     */


  //  int number = 15;

    public void divisiblenumber(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = scan.nextInt();  //read number from users

        if (number % 5==0 && number % 3==0){
            System.out.println(number+ "Divisible by 5 and 3");
        }
        else if (number % 5==0) {
            System.out.println("Divisible by 5");
        }
        else if (number %3==0) {
            System.out.println("Divisible by 3");
        }
        else {
            System.out.println("Not divisible by 5 or 3");
        }
    }

    public static void main(String[] args) {
        Divisible obj = new Divisible();
        obj.divisiblenumber();
    }
}
