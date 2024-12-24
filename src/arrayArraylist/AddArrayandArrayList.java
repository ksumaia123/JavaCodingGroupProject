package arrayArraylist;

import java.util.ArrayList;

public class AddArrayandArrayList {

    /*
    Take 5 numbers like 100,200,300,400,500 and add all number. Use array and Array List format.
    */

    public  static void arrlistadd(){
        int[] numbers = {100, 200, 300, 400, 500};

        // Initialize a variable to hold the sum
        int sum = 0;
        // Loop through the array and add each number to sum
        for (int num : numbers) {
           sum= sum+num;

        }
        // Print the sum
        System.out.println("Sum using Array: " + sum);
    }


    //ArrayList
    public static void arraylistfunc() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        // Initialize a variable to hold the sum
        int sum = 0;

        // Loop through the ArrayList and add each number to sum
        for (int num : numbers) {
            sum += num;
        }

        // Print the sum
        System.out.println("Sum using ArrayList: " + sum);
    }



    public static void main(String[] args) {
        arrlistadd();
      //  arraylistfunc();
    }
}


