package Programs;

import java.util.Arrays;

//Selection Sort
public class SelectionSort
{
    static int[] selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int index=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[index]>arr[j])
                    index=j;
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr= {1,6,2,9,4,5,8,7,3};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
