package Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class findLastNonRepeatedCharacter {
    static char findLastNonRepeatedChar(String string) {
        Map<Character, Integer> value = new LinkedHashMap<Character, Integer>();
        for (int a = 0; a < string.length(); a++) {
            if (value.containsKey(string.charAt(a))) {
                value.put(string.charAt(a), value.get(string.charAt(a)) + 1);
            } else
                value.put(string.charAt(a), 1);
        }
        
        for (int a = string.length()-1; a >=0; a--) {
            char ch = string.charAt(a);
            if (value.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String str = "algorithms tutorial";
        System.out.println("Given String:" + str);
        System.out.println("First Non Repeated Char:" + findLastNonRepeatedChar(str));
    }
}
