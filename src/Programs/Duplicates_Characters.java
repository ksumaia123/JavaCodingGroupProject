package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//28.	Write a program to find the duplicate characters in a string?
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Duplicates_Characters
{
    static List<Character> list = new ArrayList<>();

    static List<Character> getDuplicates(String args) {
        Map<Character, Integer> duplicateValues = new HashMap<>();
        for (int a = 0; a < args.length(); a++) {
            char character = args.charAt(a);
            if (duplicateValues.containsKey(character))
                duplicateValues.put(character, duplicateValues.get(character) + 1);
            else
                duplicateValues.put(character, 1);
        }
        for (char key : duplicateValues.keySet()) {
            if (duplicateValues.get(key) > 1) {
                list.add(key);
            }
        }
        return list;
    }
    public static void main(String[] args)
    {
        System.out.println(getDuplicates("aabbcddeffhhllkk"));
    }
}