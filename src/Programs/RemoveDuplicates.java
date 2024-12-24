package Programs;

import java.util.*;

//4.	WAP to remove duplicates from an array
//        11.	WAP to remove duplicates from the given array without using set
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class RemoveDuplicates
{
    static int[] removeDuplicates(int[] arr)
    {
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
                arr[count++]=arr[i];
        }
        arr[count++]=arr[arr.length-1];
        return Arrays.copyOf(arr, count);
    }


    static List<Integer> list=new ArrayList<>();
    static List<Integer> remove(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(!list.contains(arr[i]))
                list.add(arr[i]);
        }
        return list;
    }


    static Set<String> unique(String[] arr)
    {
        Set<String> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        return set;
    }


    public static void main(String[] args)
    {
        int[] arr={1,2,2,3,4,5,6,5,4,8};
        System.out.println("Given Array:"+Arrays.toString(arr));
        arr=removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        list=remove(arr);
        System.out.println("List of unique integers"+list);
        String[] arrs= {"java","c++","c","c","c++","java","selenium"};
        System.out.println(unique(arrs));

    }
}
