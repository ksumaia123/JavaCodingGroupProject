package Programs;

import java.util.Arrays;
//8.	Move the zero elements to the end of array
//        a.	input --> int a[]={0,1,2,0,3,0,0};
//        b.	output--> int a[]={1,2,3,0,0,0,0};
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class MovingZerosToEnd
{
    static int[] moveZerosToEnd(int[] arr)
    {
        int i=0;
        for(int a=0;a<arr.length;a++){
            if(arr[a]!=0)
                arr[i++]=arr[a];
        }

        while (i<arr.length){
            arr[i++]=0;
        }

        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr= {0,1,2,0,0,3,4,0,9};
        //int[] arr= {1,0,1,0,1,1,0,0,0};//Sorting 0's and 1's
        System.out.println(Arrays.toString(arr));
        arr=moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}

