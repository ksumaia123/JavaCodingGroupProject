package Programs;

import java.util.Arrays;
//25.	WAP to show the implementation of Hash Map
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//        26.	loop through the array and print all the elements in the reverse order
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class ReverseArray
{
    static int[] reverseArray(int[] arr)
    {
        int j=arr.length-1;
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        System.out.println("Given Array:"+ Arrays.toString(arr));
        arr=reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }
}
