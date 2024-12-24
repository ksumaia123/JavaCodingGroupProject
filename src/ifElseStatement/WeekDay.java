package ifElseStatement;

import java.util.Scanner;

public class WeekDay {

    /*
    Write a Java function and use the parameter of an integer between 1 and 7.
    It displays the weekday name.
     */

    public static void weekDaysName(int day){  //used parameter of an integer
//        Scanner scan = new Scanner(System.in);  //read files from users and consules
//        System.out.println("Enter a Weekday");
//        int day = scan.nextInt();


        if (day ==1){
            System.out.println("Monday");
        }
        else if (day==2) {
            System.out.println("Tuesday");
        }
        else if (day==3) {
            System.out.println("Wednesday");
        }
        else if (day==4) {
            System.out.println("Thursday");
        }
        else if (day==5) {
            System.out.println("Friday");
        }
        else if (day==6) {
            System.out.println("Saturday");
        }
        else if (day==7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalid week day");
        }

    }

    public static void main(String[] args) {
        WeekDay obj = new WeekDay();
        weekDaysName(5);
    }
}

