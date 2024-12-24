package ifElseStatement;

public class EvenOdd {

    /*
    7. Let’s say you have a number like 3. How do you write program to check if this is even or odd?
     */


    public static void oddEvennum(int number){

        if(number%3==0)
        {
            System.out.println("This is the even number");
        }
        else if(number%3 !=0)
        {
            System.out.println("This is the odd number");
        }
    }

    public static void main(String[] args) {
        oddEvennum(37);
    }
}

