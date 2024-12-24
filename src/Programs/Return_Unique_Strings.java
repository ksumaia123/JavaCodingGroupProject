package Programs;

//3.	WAP to take an input of List of Strings and returns a list of unique strings

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Return_Unique_Strings
{
    static void getUnique(String[] arr)
    {
        List<String> unilist=new ArrayList<String>();
        for(int i=0;i<arr.length;i++)
        {
            if(!unilist.contains(arr[i]))
                unilist.add(arr[i]);
        }
        System.out.println(unilist);
    }
    public static void main(String[] args)
    {
        String[] arr= {"hello","hi","hello","how","hi","how"};
//        List<String> list=new ArrayList<String>(Arrays.asList(arr));
        System.out.println(arr);
        getUnique(arr);
    }
}
//Input:-[hello, hi, hello, how, hi, how]
//        Output:-[hello, hi, how]
