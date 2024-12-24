package Programs;

public class Check_ArmstrongNumber {

    //153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
    //1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634

    public static void main(String[] args) {
        int numb = 153;
        //checkArmStrongNumber(numb);
        checkArmStrongNumber1(numb);
    }

    static void checkArmStrongNumber(int numb) {
        int result = 0, reminder, temp;
        temp = numb;
        double length = length(numb);
        while (numb != 0) {
            reminder = numb % 10;
            numb = numb / 10;
            result += Math.pow(reminder, length); //  3 is digits of the number
        }
        if (temp == result)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }

    static void checkArmStrongNumber1(int numb) {
        int result = 0, reminder, temp;
        temp = numb;
        while (numb != 0) {
            reminder = numb % 10;
            result = result + reminder * reminder * reminder;
            numb = numb / 10;

        }
        if (temp == result)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }

    static double length(int numb) {

        int count = 0;
        while (numb != 0) {
            numb = numb / 10;// to remove the last digit in the given number
            count++;
        }
        System.out.println("length of the given number is " + count);

        return count;
    }

}
