package _11_10_2018.Assignment_1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListBenchmark {
    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();

        //add

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("LinkedList add:  \t" + duration);

        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }

        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get:  \t" + duration);

        startTime = System.nanoTime();

        //remove

        for (int i = 99999; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;

        System.out.println("LinkedList remove: \t" + duration);
    }
}
