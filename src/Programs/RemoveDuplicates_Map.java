package Programs;

// Removing Duplicates using Map

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates_Map
{
    static int[] removeDuplicates_Map(int[] arr)
    {
        int k=0;
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hmap.containsKey(arr[i]))
                hmap.put(arr[i],hmap.get(arr[i])+1);
            else
                hmap.put(arr[i],1);
        }
        for(int key:hmap.keySet())
        {
            //System.out.println(key);
            arr[k++]=key;
        }
        return Arrays.copyOf(arr,k);
    }

    public static void main(String[] args)
    {
        int[] arr={1,2,3,2,3,4,5,3};
        System.out.println("Given Array:"+Arrays.toString(arr));
        arr=removeDuplicates_Map(arr);
        System.out.println(Arrays.toString(arr));
    }
}
