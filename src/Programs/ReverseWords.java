package Programs;

//32.	String s ="web internet web chrome internet safari"  reverse the words
//        op: safari internet chrome web internet web
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class ReverseWords
{
    static String reverseWords(String str)
    {
        String reverse=" ";
        String[] words=str.split(" ");
        for(int i=words.length-1;i>=0;i--)
        {
            reverse+=words[i]+" ";
        }
        return reverse.trim();
    }
    public static void main(String[] args)
    {
        String str="web internet web chrome internet safari";
        System.out.println(reverseWords(str));
    }
}
