package practiceofArjunClass;

import java.util.HashMap;
import java.util.Map;

public class OccurancePractice {
//    3)	Let take your first name “uprigttechsolutions”.
//    Write a program that print the occurances of the each characters.
//    Lets’s say u is displaying 2 times, t three times, p 1 time.

    public static void OccurancePr(){
        String name ="uprigttechsolutions";
        Map<Character,Integer> map = new HashMap<>(); //Syntax for Hashmap

        for(int i=0; i<name.length(); i++){
            char ch = name.toLowerCase().charAt(i);  //returns the character at the specified index
//checking map contains the value or not
            if (map.containsKey(ch)){  //contains key used to check if the key is present or not
                map.put(ch, map.get(ch)+1); // taking the existing character value and appending with 1
            }
            else {
                map.put(ch,1);   //if value does not exist in map we are adding character and count as 1.
            }
    }


        //Iterating the map values
        for(char ch:map.keySet()){
            if (ch!=' '){
                System.out.println(ch+" "+map.get(ch));   //Shows Key and Value together Ex: C 1
            }
        }

        System.out.println(map);

    }

    public static void main(String[] args) {
        OccurancePr();
    }
}
