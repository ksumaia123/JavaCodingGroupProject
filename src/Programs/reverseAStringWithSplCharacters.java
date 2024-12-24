package Programs;

public class reverseAStringWithSplCharacters {

    public static void main(String[] args) {
        String str = "ABCD^&^&JKJK^&^&JJKJ";
        reverseAString(str);
    }

    static void reverseAString(String str) {
        String str2 = str;
        str = str.replaceAll("[^a-zA-Z0-9]", " ");

        StringBuilder reverse = new StringBuilder();
        StringBuilder reverse2 = new StringBuilder();

        for (int a = str.length() - 1; a >= 0; a--) {
            reverse.append(str.charAt(a));
        }
        for (int a = 0; a < str2.length(); a++) {
            char ch = str2.charAt(a);
            if (!Character.isLetter(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch)) {
                reverse2.append(ch);
            } else {
                reverse2.append(reverse.charAt(a));
            }
        }
        System.out.println(reverse2);
    }
}
