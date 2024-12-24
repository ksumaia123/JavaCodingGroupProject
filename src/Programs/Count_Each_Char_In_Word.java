package Programs;

//33.	String "racecar", "abcdecac", "override", "madam"
//        a.	Find the count of each character in the above metioned strings
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//

import java.util.HashMap;
import java.util.Map;

public class Count_Each_Char_In_Word {
    static Map<String, Map<Character, Integer>> stringMap = new HashMap<String, Map<Character, Integer>>();

    public static Map<String, Map<Character, Integer>> count(String[] args) {

        for (int g = 0; g < args.length; g++) {
            String first = args[g];
            System.out.println(first);
            Map<Character, Integer> second = new HashMap<Character, Integer>();
            for (int a = 0; a < first.length(); a++) {
                char character=first.charAt(a);
                if (second.containsKey(character)){
                    second.put(character, second.get(character) + 1);
                } else {
                    second.put(character, 1);
                }
            }
            stringMap.put(first, second);
        }
        return stringMap;
    }

    public static void main(String[] args) {
        String[] arr = {"racecar", "abcdecac", "override", "madam"};
        stringMap = count(arr);
        for(String value :stringMap.keySet()){
            System.out.println(value+"====="+stringMap.get(value));
        }
//        for (Entry<String, Map<Character, Integer>> entry : stringMap.entrySet()) {
//            System.out.println(entry.getKey() + "-->" + entry.getValue());
//        }
    }
}
