package Programs;

import java.util.Arrays;

public class sortFirstAndLastNumbersInArray {


    public static void main(String[] args)
    {
        Integer[] values ={10,40,30,200,98,38,45,55,77,89};
        int num=200;

        for(int a=0;a<values.length;a++){
            for(int b=a+1;b<values.length;b++){
                if(values[a]>values[b] && (values[a] !=num & values[b]!=num)){
                    int temp=values[a];
                    values[a]=values[b];
                    values[b]=temp;
                }
                if(values[b]==num)
                    break;
            }
        }
        System.out.println(Arrays.toString(values));
    }
}
