package loopsPackage;

public class ReverseDigit {
    public void reverse(){
        int number = 5925;
        int reverse=0;


        while (number>0){
            int digit = number%10; // it will give me the ramainder or last digit
            reverse = reverse * 10 +digit; //52 X 10 + 9 =529 ----- 529X10+5=5295
            number = number/10; // 59
        }

        System.out.println(reverse);
    }

    public static void main(String[] args) {
        ReverseDigit obj = new ReverseDigit();
        obj.reverse();
    }
}
