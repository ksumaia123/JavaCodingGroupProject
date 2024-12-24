package Programs;

import java.util.LinkedHashMap;
import java.util.Map;

//    18.	Given an array (1,3,4,5,2) and a number k, find all elements that appear k times
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class K_Times_Occurrence_Elements1 {

    static char count(char[] arr, int k) {
        Map<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hmap.containsKey(arr[i]))
                hmap.put(arr[i], hmap.get(arr[i]) + 1);
            else
                hmap.put(arr[i], 1);
        }
        for (char c : hmap.keySet()) {
            if (hmap.get(c) == k)
                return c;
        }
        return '\0';
    }

    public static void main(String[] args) {
        char[] arr = {'1', '3', '4', '5', '2', '3'};
        int k = 2;
        char c = count(arr, k);
        if (c != '\0')
            System.out.println(c + " is the char that occurred " + k + " times");
        else
            System.out.println("No char found");
    }
}
