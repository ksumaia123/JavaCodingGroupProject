package Programs;

//14.	Search particular character in the given string
//
//        a.	String = "Manjusha"
//
//        b.	Our Target Value  = "u" then returns Test Passed
//        c.	Our Target Value  = "K" then returns Test Failed
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class Search_Char
{
    static String searchChar(String str,char c)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
                //if(str.contains(String.valueOf(c)))
                return "Test Passed";
        }
        return "Test Failed";
    }
    public static void main(String[] args)
    {
        String str="Manjusha";
        char c='a';
        System.out.println(searchChar(str, c));
    }
}
