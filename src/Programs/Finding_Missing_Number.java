package Programs;

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//        7.	Find out the missing number in the array of length n-1 and integers in the range of 1 to n.
//        22.	Find out the missing number in the array of length n-1 and integers in the range of 1 to n.
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class Finding_Missing_Number
{

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 5, 6, 7, 8, 9};
        int lastNumber = values[values.length - 1];
        int length = values.length;
        int missingNumber = findMissingNumber(values, lastNumber, length);
        System.out.println(missingNumber);

    }

    static int findMissingNumber(int[] values, int lastNumber, int length) {

        int total = (lastNumber * (lastNumber + 1)) / 2;
        for (int a = 0; a < length; a++) {
            total -= values[a];
        }
        return total;
    }






















}
