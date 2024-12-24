package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//43.	Compare two string
//        Input:-	String s1="it is rainy day"
//        String s2="rainy day it is"
//        Output:-	should return true
//
//        Input:-	String s1="it is rainy day"
//        String s2="rain day it is"
//        Output:-	should return false
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class ComparingStrings {
    static boolean compare_chararrays(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        System.out.println(Arrays.toString(ch1));

        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch2));
        return Arrays.equals(ch1, ch2);
    }
    static boolean compare_lists(String str1,String str2) {
        int count=0;
        String[] firstString=str1.split(" ");
      //  Arrays.toString(firstString);
        List<String> values=new ArrayList<>(Arrays.asList(firstString));
        String[] secondString =str2.split(" ");
     //   Arrays.toString(secondString);
        for(int i=0;i<secondString.length;i++){
            if(values.contains(secondString[i]))
                count++;
        }
        return secondString.length==count;
    }
    static boolean compare(String str1,String str2)
    {
        int i = 0;
        String[] count1 = str1.split(" ");
        String[] count2 = str2.split(" ");
        Arrays.sort(count1);
        Arrays.sort(count2);
        System.out.println(Arrays.toString(count1));
        System.out.println(Arrays.toString(count2));
        for (int j = 0; j < count1.length; j++) {
            if (count1[i].equals(count2[i])) {
                i++;
            }
        }
        return count1.length == i;
    }
    public static void main(String[] args)
    {
        //System.out.println(compare_chararrays("neelima","eeliman"));
        //System.out.println(compare("it is a rainy day","rainy day it is a"));
        System.out.println(compare_lists("it is a rainy day", "rainy day it is a"));
    }
}
