package _11_10_2018.Assignment_1;

import _25_08.JUtils;

import java.util.*;

public class StackAssignment {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            int random = JUtils.randomize(1, 9);
            stack.push(random);
        }

        System.out.println(stack);

        Comparator comparator = Collections.reverseOrder();
        Collections.sort(stack, comparator);

        System.out.println(stack);

    }
}
