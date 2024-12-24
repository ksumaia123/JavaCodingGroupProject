package mockPractice;

public class ReverseStringMock {
    //Suppose there is a string “ This is a mentoring session” how to reverse only string -- not the character.
public static void reverseString(){
    String word ="This is a mentoring session";
    String revWords ="";
    String value[] =word.split(" ");   //We are splitting the string
    //we are iterating the array
    for(int i=value.length -1; i>=0; i--){
        //getting the values one by one and storing into it
        revWords=revWords+value[i]+ " ";   ////sessionmentoringaisThis
    }
    System.out.println(revWords);  //session mentoring a is This

}

    public static void main(String[] args) {
        reverseString();
    }
}
