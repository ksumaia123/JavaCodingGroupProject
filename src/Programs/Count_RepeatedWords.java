package Programs;

//b.	No. of repeated words in a sentence

import java.util.HashMap;
import java.util.Map;

public class Count_RepeatedWords
{
    static int countRepeated(String str)
    {
        int i = 0;
        String[] words = str.split(" ");
        Map<String, Integer> values = new HashMap<String, Integer>();
        for (int a = 0; a < words.length; a++) {
            {
                if (values.containsKey(words[a]))
                    values.put(words[a], values.get(words[a]) + 1);
                else
                    values.put(words[a], 1);
            }
        }
            for (String s:values.keySet()) {
                if(values.get(s)>1){
                    i++;
                    System.out.println(s);
                }
            }
        return i;
    }
    public static void main(String[] args)
    {
        String str="hello java world java world java hello java";
        int count=countRepeated(str);
        if(count!=0)
            System.out.println("Number of repeating word(s):"+count);
        else
            System.out.println("No word is repeating");
    }
}
