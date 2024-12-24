package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        String charcters = "{{{{}}}}(){}{}{}({})([])))";
        checkArmStrongNumber(charcters);
    }


    static void checkArmStrongNumber(String number) {

        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '{' || number.charAt(i) == '[' || number.charAt(i) == '(') {
                System.out.println("count +"+count);
                count++;
            } else if (number.charAt(i) == '}' || number.charAt(i) == ']' || number.charAt(i) == ')') {
                System.out.println("count -"+count);
                count--;
            }

        }
        if (count == 0) {
            System.out.println("given string is have balanced parenthesis");
        } else {
            System.out.println("given string is not have balanced parenthesis");
        }

    }


}
