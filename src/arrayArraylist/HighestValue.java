package arrayArraylist;

import java.util.ArrayList;
import java.util.List;

public class HighestValue {

    /*
    Take 5 numbers like 100,200,300,400,500  and write a program to find the highest value from those number?
    Use Array format?
     */

        public void highestArrayFormat(){
            // Initialize the array with the given numbers
            int[] numbers = {100, 200, 300, 400, 500};

            // Assume the first element is the highest
            int highest = numbers[0];

            // Loop through the array to find the highest value

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > highest) {
                    highest = numbers[i]; // Update highest if current element is greater
                }
            }

            // Output the highest value
            System.out.println("The highest value is: " + highest);
        }



    /*
Take 5 numbers like 100,200,300,400,500  and write a program to find the highest value from those number?
Use ArrayList format?
 */
    public  void highestArraylist(){
        List<Integer> number = new ArrayList<>();
        int max = 0;  //declaring max value 0=100 maximum number
        number.add(100);
        number.add(200);
        number.add(300);
        number.add(400);
        number.add(500);

        for (int i=0; i< number.size(); i++){

            if (number.get(i)>max){
                //  100>100
                //200>100
                //300>100
                //400>100
                //500>100
                max= number.get(i);
                //100=500
            }
        }
        System.out.println(max);
    }


    public static void main(String[] args) {
        HighestValue obj = new HighestValue();
         obj.highestArrayFormat();
      //  obj.highestArraylist();


    }

}
