package loopsPackage;

import java.util.Scanner;

public class Multiplication {

    /*
    2. Write a program that prints the multiplication table of a given number using a for loop.
     */

    public void multiplicationTable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Multiplication table of "+ number );  //For each iteration, it calculates number * i and prints the result in the format number x i = result.

        for (int i=1; i<=10; i++){   //1+1=2
            System.out.println(number+ "x"+ i+ "="+ (number*i));
                            //    2+ x + 1+ = +(2*1) =2
                            // 2+ x+2+=+(2*2)=4


        }


    }

    public static void main(String[] args) {
        Multiplication obj = new Multiplication();
        obj.multiplicationTable();
    }
}
