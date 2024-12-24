package arrayArraylist;

public class AverageArraylist {

    /*Take 5 numbers like 100,200,300,400,500 and find the average of those number.  */
    public static void avglist() {
        int[] numbers = {100, 200, 300, 400, 500};

        // Initialize a variable to hold the sum
        int sum = 0;
//for()
        // Loop through the array and add each number to sum
        for (int num : numbers) {
            sum += num;
        }
        // Calculate the average
        int average = sum / (int) numbers.length;    //average=sum/total number
        // Print the average
        System.out.println("Average using Array: " + average);
    }


    public static void main(String[] args) {
        avglist();

    }
}



