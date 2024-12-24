package stringPackage;
//Lets say
//
//firstString = "Batch-N";
//secondString = "is learning Java language now";
//
//Ø	How to get length of firstString?
//
//Ø	How to get upper case of the firstString
//
//Ø	How to get 4th letter of firstString?
//
//Ø	Validate that if firstString contains 5, “we are good” else “We need to check code
//
//Ø	Validate that secondString starts with “is”
//
//Ø	Validate that secondString starts with “now”
//Ø	Concat firstString and secondString
//
//Ø	Retrieve “Java” from secondString and print

public class StringDemo {

    public static void strfunction(){
        String   firstString  ="Batch-N";//datatype variable name= "value"; //first string "Batch-N"
        if (firstString.contains("5")) { //using contains method
            System.out.println("we are good");
        } else {
            System.out.println("We need to check code");
        }



        String secondString="is learning java language now";  //second string
        if (secondString.startsWith("is")) {  //startswith method
            System.out.println("secondString starts with 'is'");
        } else {
            System.out.println("secondString does not start with 'is'");
        }
        if (secondString.startsWith("now")) {
            System.out.println("secondString starts with 'now'");
        } else {
            System.out.println("secondString does not start with 'now'");
        }

        String fullname = firstString.concat( "is learning java language now");
        System.out.println(fullname);

        String javaWord = secondString.substring(12, 16); // "Java" starts at index 14 and ends before index 18
        System.out.println(javaWord); // Output will be "Java"

        // String concatenatedString = firstString + " " + secondString;
        //System.out.println(concatenatedString); // Output will be "Batch-N is learning Java language now"

        int length=firstString.length();   //get length of firstString
        String upper=firstString.toUpperCase(); //upper case of firststring

        System.out.println(length);
        System.out.println(upper);
        char fourthletter=firstString.charAt(3);  //fourth letter of firstString
        System.out.println(fourthletter);

    }

    public static void main(String[] args) {
        strfunction();
    }
}


