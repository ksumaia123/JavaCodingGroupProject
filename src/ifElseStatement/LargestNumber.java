package ifElseStatement;

import java.util.Scanner;

public class LargestNumber {

    /*
6. Write a program that finds the largest of three numbers using if-else.        (//Self note: //when we see from users we need to use Scanner class.)
Exercise:
Take three numbers from user as three different variables .
Use if-else statements to check which number is the largest, and print that number.
     */


    public static void largestnum() {
        Scanner scanner = new Scanner(System.in);

// Ask the user to input three numbers
        System.out.print("Enter the first number: ");  //read number from users and consule
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = scanner.nextInt();

// Find the largest number using if-else statements
        if (n1 >= n2 && n1 >= n3) {
            System.out.println("The largest number is: " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("The largest number is: " + n2);
        } else {
            System.out.println("The largest number is: " + n3);
        }
    }
    public static void largestnum1(){
        int a=30,b=59,c=47;
        if(a>b)
        {
            if(a>c)
                System.out.println(a);
            else {
                System.out.println(c);
            }
        }
        else {
            if(b>c)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }

    public static void main(String[] args) {
//largestnum();
        largestnum1();
    }

}


