package loopsPackage;

import java.util.Scanner;

public class ReverseDigits {
    /*
    3. Write a program to reverse the digits of a given integer using a while loop.
     */

    public void ReverseDegitinteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer to reverse:");
        int number = sc.nextInt();

        int reversed = 0;
        while (number !=0){
            int digit = number %10;
            reversed = reversed *10+digit;
            number /=10;
        }
        System.out.println("Reversed number: " + reversed);

    }

    public static void main(String[] args) {
        ReverseDigits obj = new ReverseDigits();
        obj.ReverseDegitinteger();
    }

}
