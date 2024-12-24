package Programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringPrograms {
    //Check if the given sentence is Pangram or not

    public static void main(String[] args) {

        //Check if the given sentence is Pangram or not
        checkStringPanagramOrnot();

        String[] string = {"a", "z", "n", "v"};//a;z;n;v
        String separator = ";";
        String joint = String.join(separator, string);
        System.out.println(joint);

        String join2 = Arrays.asList(string).stream().collect(Collectors.joining(separator));
        System.out.println(join2);

        System.out.println(stringJoint(separator, string));


        String string1 = "mallikarjuna gooty";
        String caps = capitalizeString(string1);
        System.out.println(caps);
        String string2 = "mallikarjuna";
        caps = capitalizeString(string2);
        System.out.println(caps);
        String string3 = "m";
        caps = capitalizeString(string3);

        System.out.println(caps);

    }

    static String capitalizeString(String string) {

        if(string.length()==1)
            return string.toUpperCase();

        String[] words = string.split(" ");
        String newString = "";

        for (String w : words) {
            String one = w.substring(0, 1).toUpperCase();
            String two = w.substring(1);
            newString+= one + two + " ";
        }
        return newString.trim();
    }


    static String stringJoint(String separator, String... string) {

        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String v : string) {
            if (v != null) {
                stringBuilder.append(v);
                count = stringBuilder.length();
                stringBuilder.append(separator);
            }
        }

        return stringBuilder.substring(0, count);
    }


    public static void checkStringPanagramOrnot() {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean[] alphaList = new boolean[26];
        int index = 0;
        int flag = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            alphaList[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (alphaList[i] == false)
                flag = 0;
        }
        System.out.println("String: " + str);
        if (flag == 1)
            System.out.println("\nThe above string is a pangram.");
        else
            System.out.println("\nThe above string is not a pangram.");
    }
}
