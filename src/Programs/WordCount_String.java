package Programs;

//29.Write a program to count:
//        a.No.of characters in a string
//        b.No.of repeated words in a sentence
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//a.No. of characters in a string
public class WordCount_String
{
    static int countWords(String str)
    {
        int wc=0;
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
//            if(Character.isWhitespace(str.charAt(i)))
            if(str.charAt(i)==' '|| str.charAt(i)=='\n'|| str.charAt(i)=='\t')
            {
                flag=0;
            }
            else if(flag==0)
            {
                flag=1;
                wc++;
            }
        }
        return wc;
        //System.out.println("Number of words in given string:"+wc);
    }
    static int countChars(String str)
    {
        int cc=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ' && str.charAt(i)!='\n' && str.charAt(i)!='\t')
            {
                cc++;
            }
        }
        return cc;
        //System.out.println("Number of charactes:"+wc);
    }
    public static void main(String[] args)
    {
        String str="\n" +
                "    Designed, implemented and developed Data Driven framework using POM approach (Page Object Model) and Page factory concepts and resources in source  ";
        System.out.println("Gven String:"+str);
        System.out.println("Total number of words:"+countWords(str));
        System.out.println("Total number of characters:"+countChars(str));
    }
}

