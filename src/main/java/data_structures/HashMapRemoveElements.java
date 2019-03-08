package data_structures;

import java.util.HashMap;
import java.util.Map;

public class HashMapRemoveElements {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Alex");
        map.put(101, "Ben");
        map.put(102, "Den");
        System.out.println("Initial list of elements: "+ map);

        //key-based removal
        map.remove(100);
        System.out.println("Updated list of elements " + map);


    }
}
