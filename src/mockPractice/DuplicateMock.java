package mockPractice;

import java.util.ArrayList;
import java.util.List;

public class DuplicateMock {
    //Suppose 1,2,3,4,4,5,6 . how to remove duplicate value from this list?
    public static void removeDuplicateValue(){
       int[] values ={1,2,3,4,4,5,6};
       List<Integer> list = new ArrayList<>();
       for(int i=0; i<values.length; i++){
           if(!list.contains(values[i])){
               list.add(values[i]);
           }
       }
        System.out.println(list);
    }

    public static void main(String[] args) {
        removeDuplicateValue();
    }
}
