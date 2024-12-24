package Programs;

import java.util.Arrays;
//42.	Given a range of numbers e.g. (1,4,5,8,6,2,7,3,9). write a program to find pairs of numbers whose sum is 8. Also what approach can be applied if the same range is scaled to over 10 million numbers (The trick here is to distribute the range into smaller range and send it for parallel execution and merge the outputs)
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class SumOfPairs
{
    static void getPairs()
    {
        int[] arr= {20,35,25,2,8,11,15,18 };
        Arrays.sort(arr);
        int sum=33;
        int low=0;
        int high=arr.length-1;
        while(low<high)
        {
            if(arr[low]+arr[high]==sum)
            {
                System.out.println(arr[low]+","+arr[high]);
            }
            if(arr[low]+arr[high]>sum)
                high--;
            else
                low++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        getPairs();
    }
}
/*
	int sum=10;
	for(int i=0;i<arr.length-1;i++)
	{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]+arr[j]==sum)
		{
			System.out.println(arr[i]+" "+arr[j]);
		}
	}
	}
*/


