package Programs;

public class convertNumberToWord {

    public static void main(String[] args) {
        int ab = 10;
        convertNumberToWords(ab);

    }

    static void convertNumberToWords(int value) {

        String number = String.valueOf(value);
        String[] vv = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int a = 0; a < number.length(); a++) {
            char ch = number.charAt(a);
//            printValue(ch);
            System.out.print(vv[Character.getNumericValue(ch)]);
        }
    }

    static void printValue(char ch) {
        switch (ch) {
            case '0':
                System.out.print("zero ");
                break;
            case '1':
                System.out.print("one ");
                break;
            case '2':
                System.out.print("two ");
                break;
            case '3':
                System.out.print("three ");
                break;
            case '4':
                System.out.print("four ");
                break;
            case '5':
                System.out.print("five ");
                break;
            case '6':
                System.out.print("six ");
                break;
            case '7':
                System.out.print("seven ");
                break;
            case '8':
                System.out.print("eight ");
                break;
            case '9':
                System.out.print("nine ");
                break;
        }


    }
}
