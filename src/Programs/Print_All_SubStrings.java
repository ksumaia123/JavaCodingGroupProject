package Programs;

//41.	Given a string find the total number of sub-strings that can be formed out of it. (This is a mathematical problem of finding the number of permutations of a given number.) also write a program to print all the sub-strings.
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class Print_All_SubStrings
{
    static void getAllSubstrings(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                count++;
                System.out.println(str.substring(i,j));
            }
        }
        System.out.println("Total number of substrings are:"+count);
    }
    public static void main(String[] args)
    {
        String str="aabbcddeeff";
        getAllSubstrings(str);
    }
}