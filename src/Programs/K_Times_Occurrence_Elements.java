package Programs;

import java.util.LinkedHashMap;
import java.util.Map;

//12.	Given char array [a,b,b,c,d,f]
//
//        a.	given value k
//        b.	return first element that occurs in this array k times
//        c.	k=2 return b
//        d.	k=3 return anything
//        e.	k=1 return a
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class K_Times_Occurrence_Elements
{
    static char count(char[] arr,int k)
    {
        Map<Character,Integer> hmap=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hmap.containsKey(arr[i]))
                hmap.put(arr[i],hmap.get(arr[i])+1);
            else
                hmap.put(arr[i],1);
        }
        for(char c:hmap.keySet())
        {
            if(hmap.get(c)==k)
                return c;
        }
        return '\0';
    }
    public static void main(String[] args)
    {
        char[] arr= {'a','b','b','c','d','f'};
        int k=1;
        char c=count(arr, k);
        if(c!='\0')
            System.out.println(c+" is the char that occurred "+k+" times");
        else
            System.out.println("No char found");
    }
}
