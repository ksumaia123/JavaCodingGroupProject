package stringPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringDuplicate {
    //	Suppose 1,2,3,4,4,5,6 . how to remove duplicate value from this list?
    public static void DuplicateValue(){

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        for (int i=0; i< numbers.size(); i++){
            System.out.println(numbers.get(i));
            }
        Set<Integer> set1 = new HashSet<>(numbers);
        System.out.println(set1);
        }

        public static void duplicatemethod2(){
        int[]arr ={1,2,3,4,4,5,6};
        HashSet<Integer>set= new HashSet<>();
        for (int num:arr){
            set.add(num);
        }
            System.out.println(set);
        }


    public static void main(String[] args) {
    //    DuplicateValue();
        duplicatemethod2();
    }
}
