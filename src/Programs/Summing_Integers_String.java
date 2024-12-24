package Programs;

//30.	Write a program to add the integers in a string
//
//        a.	String s = "abc123def45gh6i7"
//        b.	Output: 123+45+6+7 = 181
//
//        39.	Write a program to add the integers in a string
//
//        String s = "abc123def45gh6i7"
//        Output: 123+45+6+7 = 181
//        Write Unit tests to test the given program
//        What is the Complexity of the program written and how it can be improved?
//
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class Summing_Integers_String
{
    static int sumIntegers(String str)
    {
        String temp="";
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                temp+=str.charAt(i);
            }
            else if(temp!="")
            {
                sum+=Integer.parseInt(temp);
                temp="";
            }
            if (i == str.length() - 1 && Character.isDigit(str.charAt(str.length() - 1))) {
                sum += Integer.parseInt(temp);
            }
//            if(i == str.length() - 1)
//                sum += Integer.parseInt(temp);
        }

        return sum;
    }
    public static void main(String[] args)
    {
        String str = "abc123def45gh6i7rer6";
        System.out.println(sumIntegers(str));
    }
}
