package stringPackage;

import java.util.HashMap;
import java.util.Map;

public class StringOccurence {

    public static Map<Character, Integer> getCharacterOccurrences() {
        String input =
                "uprighttechsolutions"
                ;
        Map<Character, Integer> charOccurrences =
                new
                        HashMap<>();

        // for each Loop through the string

        for
        (
                char
                        c : input.toCharArray()) {
            // Increment count if the character already exists in the map
            charOccurrences.put(c, charOccurrences.getOrDefault(c, 0) + 1);
        }


        return
                charOccurrences;
    }

    public static void main(String[] args) {
        System.out.println(getCharacterOccurrences());
    }

}
