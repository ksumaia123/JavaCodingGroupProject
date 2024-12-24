package arrayArraylist;

public class ArrayFormat {
    /*
    Take 5 numbers like 100,200,300,400,500 and use it in an array format and print out all the numbers using loop.
     */
    public static void arrayPrintNum(){
        int[] num ={ 100,200,300,400,500};
        for (int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
    }

    public static void arrayPrintString(){
        String[] car ={"BMW", "Toyata","Camry","Tesla"};
        for (int i=0;i<car.length;i++)
        {
            System.out.println(car[i]);
        }
    }

    public static void main(String[] args) {
      //  arrayPrintNum();
        arrayPrintString();
    }
}
