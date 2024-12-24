package Programs;

import java.util.Stack;
//17.	input="(())" return true input="((())" return false. if String contains matched Open and close brackets return true otherwise return false.
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Checking_Balanced_Parantheses_Example {

    public static void main(String[] args) {

        String charcters = "{{{{}}}}(){}{}{}({})([])";
        System.out.println(checkBalancedParantheses(charcters));
    }

    public static String checkBalancedParantheses(String values) {
        System.out.println(values);
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < values.length(); i++) {
            if (values.charAt(i) == '{' || values.charAt(i) == '(' || values.charAt(i) == '[') {
                stack.push(values.charAt(i));
            } else if ((!stack.empty()) && (values.charAt(i) == '}' || values.charAt(i) == ')' || values.charAt(i) == ']')) {
                if ((values.charAt(i) == '}' && stack.peek() == '{') || (values.charAt(i) == ')' && stack.peek() == '(') || (values.charAt(i) == ']' && stack.peek() == '[')) {
                    System.out.println(stack.pop());
                } else {
                    return "not balanced";
                }
            } else if (values.charAt(i) == ')' || values.charAt(i) == '}' || values.charAt(i) == ']') {
                stack.push(values.charAt(i));
            }
        }
        if (stack.empty()) {
            return "String is balanced";
        } else {

            return "String is not balanced";
        }
    }

    static void checkStringIsBalanced(String value) {

        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '{' || value.charAt(i) == '[' || value.charAt(i) == '(') {
                count++;
            } else if (value.charAt(i) == '}' || value.charAt(i) == ']' || value.charAt(i) == ')') {
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