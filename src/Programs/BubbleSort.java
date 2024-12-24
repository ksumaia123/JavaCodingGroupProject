package Programs;

import java.util.Arrays;

//5.	WAP to sort an array using Collections
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//        Arrays.sort(),
//        Collections.sort()
//        TreeSet[comparator interfaces]
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//        6.	WAP to sort an array without using collections or using array sort ()
//        9.	Sort the given array [2,1,1,0,0,0,3]
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//Bubble Sort
public class BubbleSort {
    public static void main(String[] args){
//        int[] v1={1,2,4,5,6,7,8,4,3,2,1};
        int[] v1={0,0,2,0,0,3,0,1};
        System.out.println(Arrays.toString(v1));
        bubbleSortingTest(v1);
        System.out.println(Arrays.toString(v1));
    }

    public static int[] bubbleSortingTest(int[] arr){

        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }



}
