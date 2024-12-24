package arrayArraylist;

import java.util.ArrayList;

public class ArrayListFormat {

    /*Take 5 numbers like 100,200,300,400,500 and use it in an array List format and print out all the numbers using loop.  */
    public static void arraylist(){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(100);
        num.add(200);
        num.add(300);
        num.add(400);
        num.add(500);
        for(int i=0;i< num.size();i++){
            System.out.println(num.get(i));
        }

    }


    public static void arraylist1(){
        ArrayList<String> car = new ArrayList<>();
        car.add("BMW");
        car.add("Tesla");
        car.add("Camry");
        car.add("Toyata");
        for(int i=0;i< car.size();i++){
            System.out.println(car.get(i));    //to access an element in the Arraylist use get() method and refer to the index number.
        }

    }

    public static void main(String[] args) {
        arraylist();
        arraylist1();
    }

}



