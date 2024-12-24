package Programs;

import java.util.Arrays;
//16.	Given array [0,1,2,3,5,6,7]
//        a.	if target value=5 return 3
//        b.	if target value=4 return 3;
//
//        21.	Let's say we have an array
//        a.	[2,5,6,7,8] target=6 -> return index of the element 6
//        b.	[3,5,6,9] target=4 -> return index of element 4
//
//        20.	Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//        a.	[1,3,6,8,9] target= 3 return the index of 3
//        b.	target = 7 return the index if target will be inserted in the array (sorted)
//
//        23.	Given a sorted integer array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//        a.	[1,3,5,6,7] k=4 -> return the index for 4
//        b.	[2,4,5,7,8] k=5 ->5's index
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class ReturnPrevious
{
    static int returnPreviousElement(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[0])
                return arr[0];
            else if(key==arr[i] || key < arr[i])
                return arr[i-1];
            else if(key>arr[arr.length-1])
                return arr[arr.length];
        }
        return -1;
    }
    static int returnIndex(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[0])
                return 0;
            else if(key==arr[i])
                return i;
            else if (key<arr[i])
                return i;
            else if(key>arr[arr.length-1])
                return arr.length;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr= {10,20,30,50,60,70};
        System.out.println("Given Array:"+ Arrays.toString(arr));
        int key=50;
        System.out.println("Key="+key+"-->"+"Previous Element="+returnPreviousElement(arr, key));
        System.out.println("Key="+key+"-->"+"Index="+returnIndex(arr, key));
    }
}
