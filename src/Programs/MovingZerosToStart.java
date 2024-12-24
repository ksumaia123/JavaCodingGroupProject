package Programs;

import java.util.Arrays;

//Method-2-----Moving Zero To Start
public class MovingZerosToStart
{
    static int[] moveZerosToStart(int[] arr)
    {
        int count=arr.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]!=0)
                arr[count--]=arr[i];
        }
        while(count>=0)
            arr[count--]=0;
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr= {0,1,2,0,0,3,4,0};
        System.out.println(Arrays.toString(arr));
        arr=moveZerosToStart(arr);
        System.out.println(Arrays.toString(arr));
    }
}
