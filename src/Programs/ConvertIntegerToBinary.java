package Programs;

import java.util.Stack;

public class ConvertIntegerToBinary {


    public static void main(String[] args) {
        int number = 30;

        Stack<Integer> stack = new Stack<>();

        while (number != 0) {
            int reminder = number % 2;
            stack.push(reminder);
            number = number / 2;
        }

        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }
}
