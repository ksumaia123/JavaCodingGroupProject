package Programs;

import java.util.Arrays;

//Given one Array with some values (3, 1, 2, 3, 4, 5) and need to remove the value randomly of user�s choice
public class RemoveElement
    {

        static int[] remove(int[] arr,int element)
        {
            int count=0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]!=element)
                    arr[count++]=arr[i];
            }
            return Arrays.copyOf(arr, count);
        }
        public static void main(String[] args)
        {
            int[] arr= {2,4,8,7,9};
            int ele=8;
            arr=remove(arr,ele);
            System.out.println(Arrays.toString(arr));
        }
    }
//    input:-{2,4,8,7,9};
//    output:-[2, 4, 7, 9]

