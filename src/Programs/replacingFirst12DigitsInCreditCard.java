package Programs;

import java.util.regex.Pattern;

public class replacingFirst12DigitsInCreditCard {

    public static void main(String[] args) {
        String number = "1234-5678-8521-5678";
        String regex = "[A-Za-z0-9\\-]{19}";
        boolean bb = Pattern.matches(regex, number);
        System.out.println(bb);

        String value1 = "";

        for (int a = 0; a < number.length(); a++) {
            if (a >=number.length() - 4) {
                value1 += number.charAt(a);
            } else if (number.charAt(a) == '-') {
                value1 += number.charAt(a);
            } else {
                value1 += "X";
            }
        }

        System.out.println(value1);
    }
}
