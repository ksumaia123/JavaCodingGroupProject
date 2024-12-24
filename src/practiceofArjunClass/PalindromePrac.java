package practiceofArjunClass;

public class PalindromePrac {
 //   Write a program to check the given String is palindrome or not "Automation", "madam"

    public static boolean checkPalindrome(String name){
        String rev="";
        for (int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
return rev.equalsIgnoreCase(name);
    }

public static void main(String[] args){
        String name ="Automation";
        if(checkPalindrome(name)){
            System.out.println("This is a Palindorme");
        }
        else {
            System.out.println("This is not Palindrome");
        }

    name ="madam";
    if(checkPalindrome(name)){
        System.out.println("This is a Palindorme");
    }
    else {
        System.out.println("This is not Palindrome");
    }

}
}
