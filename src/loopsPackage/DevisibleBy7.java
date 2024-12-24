package loopsPackage;

public class DevisibleBy7 {

    /*
    4. Write a function and create a loop inside it from 20-50 and find which number is divisible by 7.
     */
    public void numberDivisible(){
        for (int i=20; i<50; i++){
            if(i%7==0){
                System.out.println("number is divisble by 7");
            }
            else if (i%7 !=0) {
                System.out.println("number is not divisible by 7");

            }
        }
    }

    public static void main(String[] args) {
        DevisibleBy7 obj = new DevisibleBy7();
        obj.numberDivisible();

    }
}
