package Programs;

import java.util.Stack;

//24.	WAP to Print the reverse of a string
//        a.	Input = �Chennai is a green city�
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class ReverseString
{
    static String reverseString(String str)
    {
        String reverse="";

        for(int i=str.length()-1;i>=0;i--)
        {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
    static String reverseString_Stack(String str)
    {
        String reverse="";
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            stack.push(str.charAt(i));
        }
        for(int i=0;i<str.length();i++)
        {
            reverse+=stack.pop();
        }
        return reverse;
    }
    public static void main(String[] args)
    {
        String str="Neelima Kodela";
        System.out.println(reverseString(str));
        System.out.println(reverseString_Stack(str));
    }
}
