package Programs;

import java.util.Arrays;

public class reverseStringArray {

    public static void main(String[] args) {

        String[] values ={"a","b","c","d"};
        System.out.println(Arrays.toString(values));

        String[] values2 = new String[values.length];

        int j=values.length;

        for(int a=0;a<values.length;a++){
            values2[j-1]=values[a];
            j--;
        }
        System.out.println(Arrays.toString(values2));

    }




}
