package arrayArraylist;

public class EvenOddArray {
    /*
    Write a Java program to find the number of even and odd integers in a given array of integers.
     */

    public void EvenOddInteger() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenNum = 0;
        int oddNum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                // If the number is even, print it
                System.out.println(num + " is an even number");
            }
            else {
                // If the number is odd, print it
                System.out.println(num + " is an odd number");
            }
        }
    }

    public static void main(String[] args) {
        EvenOddArray obj = new EvenOddArray();
        obj.EvenOddInteger();
    }
}

