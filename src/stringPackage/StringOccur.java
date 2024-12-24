package stringPackage;

import java.util.HashMap;
import java.util.Map;

public class StringOccur {
  //  Ø	Let take your first name “uprigttechsolutions”. Write a program that print the occurances of the each characters. Lets’s say u is displaying 2 times, t three times, p 1 time.


        public static void main(String[] args) {
            String str = "uprigttechsolutions";
            Map<Character, Integer> letterCount = new HashMap<>();

            for (char c : str.toCharArray()) {
                if (letterCount.containsKey(c)) {
                    letterCount.put(c, letterCount.get(c) + 1);
                } else {
                    letterCount.put(c, 1);
                }
            }

            // Displaying the occurrences of each letter
            for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
                System.out.println("Letter '" + entry.getKey() + "' occurs " + entry.getValue() + " time(s).");
            }
        }
    }

