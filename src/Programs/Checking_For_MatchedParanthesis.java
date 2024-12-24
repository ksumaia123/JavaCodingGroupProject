package Programs;

//48.	Program to check for Matched Paranthesis
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class Checking_For_MatchedParanthesis {

    public static void main(String[] args) {
        String param = "{}()[]";
        System.out.println(checkMatchedParantheses(param));

    }

    public static boolean checkMatchedParantheses(String values) {

        int count = 0;
        if (values.length() == 0) {
            return false;
        }
        for (int i = 0; i < values.length(); i++) {
            if (values.charAt(i) == '{' || values.charAt(i) == '(' || values.charAt(i) == '[') {
                count++;
            } else if (values.charAt(i) == '}' && values.charAt(i - 1) == '{' || values.charAt(i) == ')' && values.charAt(i - 1) == '(' || values.charAt(i) == ']' && values.charAt(i - 1) == '[') {
                count--;
            }
        }
        return count == 0;
    }
}
