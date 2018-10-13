package _11_10_2018.Assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListBenchmark {
    final static int LIMIT = 100000;
    final static int SEC = 1000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        //add
        measure("ArrayList add", (list) -> {
            for (int i = 0; i < LIMIT; i++)
                list.add(i);
        }, arrayList);

        //get
        for (int i = 0; i < LIMIT; i++)
            arrayList.get(i);

        measure("ArrayList get", (list) -> {
            for (int i = 0; i < LIMIT; i++)
                list.get(i);
        }, arrayList);

        //remove
        measure("ArrayList remove", (list) -> {
            for (int i = LIMIT - 1; i >= 0; i--)
                list.remove(i);
        }, arrayList);
    }

    public static void measure(String method, Consumer<List> consumer, List<Integer> list) {
        long startTime = System.currentTimeMillis();

        consumer.accept(list);

        long endtime = System.currentTimeMillis();
        long duration = endtime - startTime;
        System.out.println(method + ": \t" + ((double) duration) / SEC);
    }
}