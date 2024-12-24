package mockPractice;
public class PalindromeMock {
    //1)	Write palindrome code using Madam, Level, Kayak
    public static boolean checkPalindrome(String name){
        String rev="";
        for (int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        return rev.equalsIgnoreCase(name);
    }
    public static void main(String[] args) {
        String name ="Madam";
        if(checkPalindrome(name)){
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("This is not a Palindrome");
        }

        name ="Level";
        if(checkPalindrome(name)){
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("This is not a Palindrome");
        }
        name ="Sumaia";
        if(checkPalindrome(name)){
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("This is not a Palindrome");
        }
    }
}
