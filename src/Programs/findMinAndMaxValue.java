package Programs;

public class findMinAndMaxValue {


    public static void main(String[] args) {
        int[] value = {10, 20, 30, 40, 50, 60, 70};
        findMinAndMaxValue(value);
    }

    static void findMinAndMaxValue(int[] value) {

        int min = value[0];
        int max = value[0];

        for (int a = 0; a < value.length; a++) {
            if (value[a] < min)
                min = value[a];
            else if (value[a] > max)
                max = value[a];

        }

        System.out.println(min + " " + max);
    }
}
