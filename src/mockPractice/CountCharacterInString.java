package mockPractice;

//5)Let Say there is a String “Hello Please Write a Java Program” … So how many characters are there without space?

public class CountCharacterInString {

    public static void CharcaterCountWithoutSpace(String str){
        int count =0;
        for (int i=0; i<str.length();i++){ //Loop through each character of the string
            if(str.charAt(i) !=' '){  //check if the character is not a space
                count++;
            }
        }
        System.out.println("Number of characters without spaces: " +count);  //printing count of character without space
    }

    public static void main(String[] args) {
        String str = "Hello Please Write a Java Program";
        CharcaterCountWithoutSpace(str);
    }
}
