package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//47.	Finding missing numbers
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class MissingNumber {
    static List<Integer> list = new ArrayList<>();

        static List<Integer> findMissingNumbers(int[] arr1) {
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (max < arr1[i])
                max = arr1[i];
        }
        int[] count = new int[max + 1];
        for (int i : arr1) {
            count[i] = 1;
        }
        //System.out.println(Arrays.toString(count));
        for (int i = 1; i < max; i++) {
            if (count[i] == 0)
                list.add(i);
        }
        return list;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7, 9, 4};//{2,5,6,8}
        System.out.println("Given Array:" + Arrays.toString(arr1));
        list = findMissingNumbers(arr1);
        System.out.println(list);
    }
}

