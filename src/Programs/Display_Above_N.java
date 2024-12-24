package Programs;

//37.	Make given array as unique  and display above (2.5<N) only.
//        =====Example=======
//        Given array is {1,2,3,8,5,4,2,5,9,7}
//        Op Would be >> {3,8,5,4,9,7}.
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Display_Above_N {
    static List<Integer> uniqueList = new ArrayList<Integer>();

    static List<Integer> getUnique(int[] args) {

        for (int a = 0; a < args.length; a++) {
            if (!uniqueList.contains(args[a])) {
                uniqueList.add(args[a]);
            }
        }
        System.out.println(uniqueList);
        List<Integer> values = new ArrayList<Integer>();
        for (int a = 0; a < uniqueList.size(); a++) {
            if (uniqueList.get(a) > 2.5) {
                values.add(uniqueList.get(a));
            }
        }

        return values;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 5, 4, 2, 5, 9, 7};
        System.out.println("Given Array" + Arrays.toString(arr));
        //getUnique(arr);
        System.out.println("Array elements > 2.5 are:" + getUnique(arr));
    }
}

