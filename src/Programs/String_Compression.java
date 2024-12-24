package Programs;

//45.	Replace all 3 multiples with JAVA
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//        46.	String Compression
//        i/p-----aabbccd
//        o/p-----a2b2c2d1
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class String_Compression
{
    static StringBuffer compressString_Count(String str)
    {
        StringBuffer sb=new StringBuffer();
        int count=1;
        int i=0;
        for(i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
                count++;
            else
            {
                sb.append(str.charAt(i)).append(count);
                //System.out.println(sb);
                count=1;
            }
        }
        if(i==str.length()-1)
            sb.append(str.charAt(i)).append(count);
        else
            sb.append(str.charAt(i)).append(1);
        return sb;
    }
    public static void main(String[] args)
    {
        System.out.println(compressString_Count("aabbbccdddf"));//a2b3c2d3f1
    }
}