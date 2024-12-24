package stringPackage;

public class StringEmail {

    /*Let’s Say
String email = "info@uprighttechsolutions@com";

Ø   Split the email by “@” and print two arrays.

Ø   Replace the “@” with “_” and print

Ø   Reverse the email using loop
 */
    public static void funtiondemo2() {
        String email = "info@uprighttechsolutions@com";

// Split the email by "@"
        String[] emailParts = email.split("@");

// Print the resulting array of substrings
        System.out.println("First part: " + emailParts[0]);
        System.out.println("Second part: " + emailParts[1]);
        System.out.println("Third part: " + emailParts[2]);

        String replacedEmail = email.replace("@", "_");
        System.out.println("Replaced email: " + replacedEmail);


        // StringBuilder reversedEmail = new StringBuilder();

// Loop to reverse the string
        //for (int i = email.length() - 1; i >= 0; i--) {
        //  reversedEmail.append(email.charAt(i));
        //  System.out.println("Reversed email: " + reversedEmail.toString());

        //String email = "info@uprighttechsolutions@com";
        String rev = "";
        int len = email.length();// it will work with string length
        for (int i = len - 1; i >= 0; i--)
        {
            rev = rev + email.charAt(i);
        }

        System.out.println(rev);
    }




    public static void main(String[] args) {
        funtiondemo2();
    }

}

