package data_structures.Map;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteratorExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        String[] arr = {"Alex", "Ben", "Max"};
        for (int i = 0; i < 3; i++) {
            map.put(i, arr[i]);
        }

        Iterator<Entry<Integer, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Entry entry = iter.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
