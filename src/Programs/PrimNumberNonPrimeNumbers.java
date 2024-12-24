package Programs;

public class PrimNumberNonPrimeNumbers {

    public static void main(String[] args) {
        int count=0;
        // non-prime numbers
        for (int a = 2; a <= 100; a++) {

             count = 0;
            for (int b = 1; b <= a; b++) {
                if (a % b == 0)
                    count++;
            }
            if (count != 2)
                System.out.println("Non prime number is "+a);

        }

        // prime numbers
        for (int a = 2; a <= 100; a++) {

             count = 0;
            for (int b = 1; b <= a; b++) {
                if (a % b == 0)
                    count++;
            }
            if (count == 2)
                System.out.println("prime number is"+a);

        }

    }

}
