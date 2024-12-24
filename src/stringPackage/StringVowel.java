package stringPackage;

public class StringVowel {
//Let’s Say, you are given a String. How to check if any vowel’s are there or not?
    public static void checkVowels(){
        String name = "Sumaia";
        String vowels="aeiou";

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i'
                            || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                        System.out.println(name.charAt(i) + " is Vowel ");
                    }

        }

    }

    public static void main(String[] args) {
        checkVowels();
    }
}

