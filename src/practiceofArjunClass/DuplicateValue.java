package practiceofArjunClass;

import java.util.ArrayList;
import java.util.List;

public class DuplicateValue {
    //Suppose 1,2,3,4,4,5,6 . how to remove duplicate value from this list?
    public static void removeduplicate() {


        int[] values = {1, 2, 3, 4, 4, 5, 6};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<values.length;i++ ){
            if(!list.contains(values[i])){  //checking value[i] is existing in the list
                list.add(values[i]);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        removeduplicate();
    }
}
