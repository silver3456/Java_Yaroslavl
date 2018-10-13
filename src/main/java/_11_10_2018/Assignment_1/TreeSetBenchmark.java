package _11_10_2018.Assignment_1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetBenchmark {

    public static void main(String[] args) {

        Set<Integer> integerSet = new TreeSet<>();

        long startTime = System.nanoTime();

        //add

        for (int i = 0; i < 100000; i++) {
            integerSet.add(i);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("TreeSet add:  \t" + duration);

        startTime = System.nanoTime();

        //iterate

        for (int i = 0; i < 1000; i++) {
            Iterator<Integer> iterator = integerSet.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
        }

        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("TreeSet get: \t" + duration);

        startTime = System.nanoTime();

        //remove

        for (int i = 99999; i >= 0; i--) {
            integerSet.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;

        System.out.println("TreeSet remove: \t" + duration);
    }
}

