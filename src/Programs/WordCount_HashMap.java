package Programs;

//27.	Print the word count in a given sentence
//        String s = "This is sample string to count the strings"
//
//        31.	String colors = "red, blue, green, red, blue, orange, blue, red"
//        a.	Write a program to find the words number of time repeating using HashMap.
//
//        36.	For the given string count the reported words using hash map
//        a.	�Book key table key smart book key on the table science book�
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCount_HashMap
{
    static void countWords(String str)
    {
        String[] words=str.split(" ");
        System.out.println(Arrays.toString(words));
        Map<String,Integer> hmap=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            if(hmap.containsKey(words[i]))
                hmap.put(words[i],hmap.get(words[i])+1);
            else
                hmap.put(words[i],1);
        }

        for (String value:hmap.keySet()) {
            System.out.println(value+"-->"+hmap.get(value));
        }

//        for(Entry<String,Integer> entry:hmap.entrySet())
//        {
//            System.out.println(entry.getKey()+"-->"+entry.getValue());
//        }
    }
    public static void main(String[] args)
    {
        String str="red blue green red blue orange blue red";
        countWords(str);
    }
}
