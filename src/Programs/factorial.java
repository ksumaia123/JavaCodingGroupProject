package Programs;

public class factorial {

    public static void main(String[] args) {

        int num = 5;
        factorial(num);

    }

    static void factorial(int num) {

        int temp = 1;
        for (int a = 1; a <= num; a++) {
            temp = temp * a;
        }

        System.out.println(temp);


    }
}
