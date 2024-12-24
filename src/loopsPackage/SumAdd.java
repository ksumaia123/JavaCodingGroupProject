package loopsPackage;

public class SumAdd {

    /*
    5. Write a program to find the sum of 20-30
     */

    public static void summethod(){
        int sum =0;
        //20+21+22+23+24+25+26+27+28+29+30
        //Loop through the number 20 to 30 (inclusive)
        for (int i=20; i<=30; i++){
            sum +=i;  //Add the current number to the sum
        }
        //print the result
        System.out.println("The sum of integers from 20 to 30 is: "+sum);
    }

    public static void main(String[] args) {
        summethod();
    }
}
