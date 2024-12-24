package Programs;

//34.	Find the palindrome terms and if its a palindrome get the count of first character in the string and if its not a palindrome find the highest count of a character in the string
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Palindrome
{
    static boolean isPalindrome(String str)
    {
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse+=str.charAt(i);
        }
        return str.equals(reverse);
    }
    static void count(String str)
    {
        int i=0;
        char c=str.charAt(0);
        Map<Character,Integer> hmap=new HashMap<Character,Integer>();
        for(i=0;i<str.length();i++)
        {
            if(hmap.containsKey(str.charAt(i)))
                hmap.put(str.charAt(i),hmap.get(str.charAt(i))+1);
            else
                hmap.put(str.charAt(i),1);
        }
        //System.out.println(hmap);
        if(isPalindrome(str))
        {
            int count=hmap.get(c);
            System.out.print(str+" is a Palindrome" +"\n"+"Count of first char "+c+" is "+count);
        }
        else
        {
            int max=Collections.max(hmap.values());
            for(char key:hmap.keySet())
            {
                if(hmap.get(key).equals(max))
                    c=key;
            }
            System.out.println(str+" is not a Palindrome"+"\n"+"Count of most frequent char "+c+" is "+max );
        }
    }
    public static void main(String[] args)
    {
        count("lirilirlrrr");
    }
}