package _11_10_2018.Assignment_1;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDraft {
    public static void main(String[] args) throws EmptyStackException {

        Stack<Integer> stackOne = new Stack<>();
        Stack<Integer> stackTwo = new Stack<>();
        Stack<Integer> stackThree = new Stack<>();

        stackOne.push(1);
        stackOne.push(7);
        stackOne.push(4);
        stackOne.push(5);
        System.out.println(stackOne);

        int varOne = stackTwo.push(stackOne.pop());
        int varTwo = stackThree.push(stackOne.pop());

        if (varOne > varTwo) {
            stackTwo.push(stackOne.pop());
        } else
            stackThree.push(stackOne.pop());

        if (stackOne.peek() < stackThree.peek())
            stackThree.push(stackOne.pop());

        if (stackTwo.peek() > stackThree.peek())
            stackOne.push(stackTwo.pop());

        if (stackTwo.peek() > stackThree.peek())
            stackOne.push(stackTwo.pop());

        if (stackOne.peek() > stackThree.peek())
            stackTwo.push(stackThree.pop());

        if (stackTwo.peek() < stackThree.peek())
            stackOne.push(stackThree.pop());

        stackOne.push(stackTwo.pop());

        System.out.println(stackOne);


    }
}

