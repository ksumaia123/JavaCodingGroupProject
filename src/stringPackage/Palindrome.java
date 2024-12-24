package stringPackage;

public class Palindrome {

    //Ø	Write palindrome code using Madam, Level, Kayak
    public static void PalindromeString(){
        //Madam
        //Level
        //Kayak

        String name ="Madam";
        String rev ="";
        for (int i=name.length()-1; i>=0; i--){
            rev = rev +name.charAt(i); //access from string
        }
        if (name.equals(rev)){
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("This is not Palindrome");
        }
    }

    public static void PalindromeLev(){
        String name ="LeveL";
        String rev = "";
        for (int i=name.length()-1; i>=0; i--){
            rev = rev+name.charAt(i);
        }
        if (name.equals(rev)){
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("This is not Palindrome");
        }
    }

    public static void main(String[] args) {
      //  PalindromeString();
        PalindromeLev();
    }
}
