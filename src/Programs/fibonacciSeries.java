package Programs;

import java.util.ArrayList;
import java.util.List;

public class fibonacciSeries {


    public static void main(String[] args) {
        fibonacciSeriess();
        fibonacciSeriesInReverseOrderUsingArray();
        fibonacciSeriesInReverseOrderUsingList();

    }

    static void fibonacciSeriess() {

        int a, b = 0, c = 1;
        for (int d = 0; d < 20; d++) {
            a = b;//2
            b = c;//3
            c = a + b;//5
            System.out.println(a);
        }
    }

    static void fibonacciSeriesInReverseOrderUsingArray() {
        int n = 8;
        int[] f = new int[n];
        int a, b = 0, c = 1;

        for (int d =0 ; d < n; d++) {
            a = b;
            b = c;
            c = a + b;
            f[d] = a;
        }

        for (int g=n-1;g>=0;g--){
            System.out.println(f[g]);
        }

    }

    static void fibonacciSeriesInReverseOrderUsingList() {
        List<Integer> values = new ArrayList<>();
        int n = 8;
        int a, b = 0, c = 1;
        for (int d = 0; d < n; d++) {
            a=b;
            b=c;
            c=a+b;
            values.add(a);
        }
        for(int e=values.size()-1;e>=0;e--){
            System.out.println(values.get(e));
        }
    }
}
