package stringPackage;

//Suppose there is a string “ This is a mentoring session” how to reverse only string -- not the character.
public class StringReverse {

    public static void revStr(){
        String s ="This is a mentoring session";
        String rev ="";
        for (int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {

        revStr();
    }
}
