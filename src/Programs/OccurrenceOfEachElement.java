package Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//10.	Count the no.of occurences each digit in given array [1,1,1,3,2,2,2,2,0,0,0]
//        19.	Given an array of (1,2,3,4,5,2) and find the no of occurrences in an unsorted array
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class OccurrenceOfEachElement
{
    static void count(int[] arr)
    {
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hmap.containsKey(arr[i]))
                hmap.put(arr[i],hmap.get(arr[i])+1);
            else
                hmap.put(arr[i],1);
        }
        for(int value:hmap.keySet()){
            if (hmap.get(value)!=' '){
                System.out.println(value+"======"+hmap.get(value));
            }
        }
//        for(Map.Entry<Integer,Integer> entry:hmap.entrySet())
//        {
//            if(entry.getKey()!=' ')
//                System.out.println(entry.getKey()+"--->"+entry.getValue());
//        }
    }
    //Method-2[using count array]
    static void count_2(int[] arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        System.out.println(Arrays.toString(count));
        for(int i=0;i<count.length;i++)
        {
            if(count[i]>0)
                System.out.println(i+"--->"+count[i]);
        }
    }
    public static void main(String[] args)
    {
        int[] arr= {1,1,1,3,2,2,2,2,0,0,0};
        count(arr);
//        count_2(arr);
    }
}
