package practiceofArjunClass;

public class PalindromePractice {

    public static boolean checkPalindrome(String name){
        String rev ="";
        for (int i = name.length()-1; i>=0;i--){
            rev = rev+name.charAt(i);
        }
      //  System.out.println(rev);
        return rev.equalsIgnoreCase(name);
    }

    public static void main(String[] args) {
        String name ="Kayak";
        if (checkPalindrome(name)){
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("This is not Palindrome");
        }
         name ="Sumaia";
        if (checkPalindrome(name)){
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("This is not Palindrome");
        }
         name ="Level";
        if (checkPalindrome(name)){
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("This is not Palindrome");
        }
    }

}
