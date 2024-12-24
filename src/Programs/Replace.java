package Programs;

import java.util.Arrays;
//44.	Replace all spaces in a string with %20
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class Replace
{
    static String replace(char[] ch,int len)
    {
        int spacecount=0;
        for(int i=0;i<len;i++)
        {
            //counting spaces
            if(ch[i]==' ')
            {
                spacecount++;
            }
        }
        //calculating new length
        int newlength=ch.length+spacecount*2;
        System.out.println(newlength);
        //resize array with new length
        ch= Arrays.copyOf(ch,newlength);
        //replacing %20
        for (int j=len-1; j>=0; j--)
        {
            int index=newlength-1;
            if (ch[j] == ' ')
            {
                ch[index] = '0';
                ch[index-1] = '2';
                ch[index-2] = '%';
                newlength = newlength - 3;
            }
            else
            {
                ch[index] = ch[j];
                newlength--;
            }
        }
        //System.out.println(Arrays.toString(ch));
        return String.valueOf(ch);
    }
    public static void main(String[] args)
    {
        String str="neelima kodela";
        System.out.println(str+" "+str.length());
        char[] ch=str.toCharArray();
        int len=ch.length;
		/*String str1=str.replace(" ","%20");
		 *
		System.out.println(str1);*/
        System.out.println(replace(ch,len));
    }
}
