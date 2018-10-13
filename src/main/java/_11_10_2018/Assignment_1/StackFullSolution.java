package _11_10_2018.Assignment_1;


import _25_08.JUtils;

import java.util.Stack;

public class StackFullSolution {

    public static Stack<Integer> sortedStack(Stack<Integer> input) {

        Stack<Integer> tmpStack = new Stack<>();

        while (!input.empty()) {
            int temp = input.pop();

            while (!tmpStack.empty() && tmpStack.peek() > temp)
                input.push(tmpStack.pop());

            tmpStack.push(temp);
        }
        return tmpStack;

    }

    public static void main(String[] args) {

        Stack<Integer> inputStack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            int random = JUtils.randomize(1, 9);
            inputStack.push(random);
        }

        System.out.println("Input numbers are:");
        System.out.println(inputStack);

        Stack<Integer> tmpStack = sortedStack(inputStack);
        System.out.println("Sorted numbers are:");

        while (!tmpStack.empty()) {
            System.out.print(tmpStack.pop() + " ");
        }

    }
}

