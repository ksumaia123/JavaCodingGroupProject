package loopsPackage;

import java.util.Scanner;

public class naturalNumbers {
    /*
    1. Write a program that takes an integer n and calculates the sum of the first n natural numbers using a while loop.
     */

    public void sumnaturalNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
//1+2+3+4+5+6+7+8+9+10
        int sum = 0;
        int i =1; //initialization
        while (i<=n){  //condition
            sum=sum+i;  //sum=sum+i   //sum value and i value also getting changed
                     //0=0+1
                      //1
            i++;  //incrementing the value of i by 1
        }

        System.out.println("Sum of first" + n+ "natural numbers:" +sum);   //statement
//i++ simply increases i by 1 on each loop iteration to eventually meet the stopping condition (i <= n).

    }

    public static void main(String[] args) {
        naturalNumbers obj = new naturalNumbers();
        obj.sumnaturalNumbers();
    }

}
