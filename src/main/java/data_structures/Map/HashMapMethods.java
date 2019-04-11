package data_structures.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    public static void main(String[] args) {

        Map<Integer, String> mapIndexName = new HashMap<>();
        mapIndexName.put(1, "Alex");
        mapIndexName.put(2, "Max");

        //get key by value

        for (Map.Entry entry : mapIndexName.entrySet()) {
            if (entry.getValue().equals("Alex")) {
                System.out.println(entry.getKey());
            }
        }
    }
}
