package Programs;

import java.util.Arrays;
//49.	Anagram
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
class Anagram
{
    static boolean anagram(String str1,String str2)
    {
        //int count=0;
        char[] ch1=str1.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        System.out.println(ch1);

        char[] ch2=str2.toLowerCase().toCharArray();
        Arrays.sort(ch2);
        System.out.println(ch2);

        if(ch1.length!=ch2.length)
            return false;
        return Arrays.equals(ch1,ch2);
		/*for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==ch2[i])
				count++;
		}
		return ch1.length==count;*/
    }
    public static void main(String[] args)
    {
//        System.out.println(anagramTest("Eleven plus two", "Twelve plus one"));
        System.out.println(anagramTest2("Eleven plus two", "Twelve plus one"));
    }

    static boolean anagramFunction(String char1, String char2){

        char[] ch1 = char1.toLowerCase().toCharArray();
        System.out.println(ch1);
        Arrays.sort(ch1);
        System.out.println(ch1);

        char[] ch2 = char2.toLowerCase().toCharArray();
        System.out.println(ch2);
        Arrays.sort(ch1);
        System.out.println(ch2);

        if(ch1.length!=ch2.length)
            return false;
        return Arrays.equals(ch1,ch2);
    }

    static boolean anagramTest(String st1, String st2){

        char[] char1=st1.toLowerCase().toCharArray();
        Arrays.sort(char1);
        System.out.println(char1);

        char[] char2=st2.toLowerCase().toCharArray();
        Arrays.sort(char2);
        System.out.println(char2);

        if(char1.length!=char2.length){
            return false;
        }
        return Arrays.equals(char1,char2);
    }

    public static boolean anagramTest2(String Strng1, String string2){

        char[] firstSTring=Strng1.toLowerCase().toCharArray();
        Arrays.sort(firstSTring);
        System.out.println(firstSTring);

        char[] firstSTring1=string2.toLowerCase().toCharArray();
        Arrays.sort(firstSTring1);
        System.out.println(firstSTring1);

        if(firstSTring.length!=firstSTring1.length)
            return false;
        return Arrays.equals(firstSTring,firstSTring1);
    }

}
