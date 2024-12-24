package Programs;

//Method-2[Using Set]

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumOfPairs_set
{
    static void getPairs(int[] arr)
    {
        int sum=40;
        Set<Integer> set=new HashSet<Integer>();
        {
            for(int num1:arr)
            {
                int num2=sum-num1;
                if(set.contains(num2))
                {
                    System.out.println(num1+","+num2);
                }
                set.add(num1);
            }
        }
    }
    public static void main(String[] args)
    {
//        int[] arr= {-1,1,3,5,7,-2,6,-3};
        int[] arr = {20, 35, 25, 2, 8, 11, 15, 18};
        System.out.println("Given Array:"+ Arrays.toString(arr));
        getPairs(arr);
    }
}