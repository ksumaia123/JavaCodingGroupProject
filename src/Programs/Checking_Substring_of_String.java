package Programs;

//40.	Given two Strings, find if the second string is a sub-string of the first. (Both in a single line as well as without inbuilt functions)
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class Checking_Substring_of_String
{
    static boolean isSubstring(String str1,String str2)
    {
        int count = 0;
        for (int a = 0; a < str1.length(); a++) {
            if (str1.charAt(a) == str2.charAt(count)) {
                count++;
            } else {
                a = a - count;
                count = 0;
            }
            if (str2.length() == count)
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        String str1="mallikarjuna";
        String str2="juna";
        if(isSubstring(str1,str2))
            System.out.println("The given second string is SubString of first string");
        else
            System.out.println("Not SubString");
    }
}
