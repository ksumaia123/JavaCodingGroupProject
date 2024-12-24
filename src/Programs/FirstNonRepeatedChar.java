package Programs;

//35.	Find the first non-repeating character in a string by iterating only once through the string with best space and time complexity
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar
{
    static char findFirstNonRepeatedChar(String string) {
        Map<Character, Integer> value = new LinkedHashMap<>();

        for (int a = 0; a < string.length(); a++) {
            if (value.containsKey(string.charAt(a))) {
                value.put(string.charAt(a), value.get(string.charAt(a)) + 1);
            } else
                value.put(string.charAt(a), 1);
        }
        for (char c : value.keySet()) {
            if (value.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args)
    {
        String str="abefccbca";
        System.out.println("Given String:"+str);
        System.out.println("First Non Repeated Char:"+findFirstNonRepeatedChar(str));
    }

}
