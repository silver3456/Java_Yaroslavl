package _22_09_18.Assignment_3.Assignment_1;

import java.util.*;

public class StorageUtils {
    public static void printFruits(Map<String, Fruits> fruits) throws Exception {
        if (fruits.isEmpty()) throw new Exception("No fruits in the storage");

        fruits.forEach((key, value) -> System.out.println(key + ":" + value));

    }

    public static void addFruits(Fruits[] fruits, Set<Fruits> target) {
        if (fruits == null || target == null) throw new NullPointerException("Fruits or target is null");
        for (int i = 0; i < fruits.length; i++)
            target.add(fruits[i]);
    }
}