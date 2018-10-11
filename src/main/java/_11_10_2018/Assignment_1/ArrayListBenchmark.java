package _11_10_2018.Assignment_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBenchmark {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();

        //add

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        long endtime = System.nanoTime();
        long duration = endtime - startTime;
        System.out.println("ArrayList add: \t" + duration);


        startTime = System.nanoTime();

        //get

        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }

        endtime = System.nanoTime();
        duration = endtime - startTime;
        System.out.println("ArrayList get: \t" + duration);

        startTime = System.nanoTime();

        //remove

        for (int i = 99999; i >= 0; i--) {
            arrayList.remove(i);
        }
        endtime = System.nanoTime();
        duration = endtime - startTime;
        System.out.println("ArrayList remove: \t" + duration);

    }
}