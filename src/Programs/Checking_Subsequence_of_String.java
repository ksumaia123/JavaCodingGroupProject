package Programs;

//38.	 method should  return boolean value By taking string values and as shown below.
//        S=�rabbbit�;
//        T=�rabbit�//True
//        U=�tabbit�//false
//        V=�ab�//true
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Checking_Subsequence_of_String {

    public static void main(String[] agrs) {
        String one = "Mallikarjuna";
        String two = "li";
        if (isSubsequesnce(one, two)) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
        one = "mallikarjuna abcd mallikarjuna hdhfsddsfsd mallikarjuna sdfsf mallikarjuna";
        two = "mallikarjuna";
        System.out.println(stringComparision(one, two));

    }

    public static boolean isSubsequesnce(String one, String two) {
        int j = 0;
        for (int i = 0; i < one.length() && j < two.length(); i++) {
            if (one.charAt(i) == two.charAt(j)) {
                j++;
            }
        }
        return two.length() == j;
    }

    static int stringComparision(String one, String two) {
        int j = 0;
        int count = 0;
        for (int a = 0; a < one.length() && j < two.length(); a++) {
            if (one.charAt(a) == two.charAt(j)) {
                j++;
            }
            if (two.length() == j) {
                count++;
                j = 0;
            }
        }
        return count;
    }
}
