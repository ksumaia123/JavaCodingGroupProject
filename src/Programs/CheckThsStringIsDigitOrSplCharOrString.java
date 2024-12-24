package Programs;

public class CheckThsStringIsDigitOrSplCharOrString {

    public static void main(String[] args) {

        String value = "  abAb12345$%$%%   ";
        validateTheStringValues(value);

    }

    static void validateTheStringValues(String values) {

        String value = "";
        String digit="";
        String splchar = "";

        for (int a = 0; a < values.length(); a++) {

            char ch = values.charAt(a);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                value += ch;
            } else if (ch >= '0' && ch <= '9') {
                digit += ch;
            } else if(ch!=' '){
                splchar += ch;
            }

        }
        System.out.println("Characters are "+value);
        System.out.println("Digits are "+digit);
        System.out.println("spl characters are "+splchar);
    }

}
