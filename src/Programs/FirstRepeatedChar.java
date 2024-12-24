package Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//13.	Find the duplicate character in the given String "abcdedef"
//        15.	find the first repetitive letter from the given string String input="abcddeff". return 'd'
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class FirstRepeatedChar
{
    static char findFirstRepeatedChar(String str)
    {
        Map<Character, Integer> values = new LinkedHashMap<Character, Integer>();
        for (int a = 0; a < str.length(); a++) {
            if (values.containsKey(str.charAt(a))) {
                return str.charAt(a);
            } else
                values.put(str.charAt(a), 1);
        }
        return '\0';
    }
    public static void main(String[] args)
    {
        String str="abbca";
        System.out.println("Given String:"+str);
        System.out.println("First Repeated Char:"+findFirstRepeatedChar(str));
    }
}
