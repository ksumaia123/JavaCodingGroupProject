package Programs;

import java.util.Arrays;

public class removingFirstAndLastStringInArray {

    public static void main(String[] args) {


        String[] values ={"a","b","c","d"};

        String[] values2= Arrays.copyOfRange(values,1,values.length-1);

        System.out.println(Arrays.toString(values));

        System.out.println(Arrays.toString(values2));




    }
}
