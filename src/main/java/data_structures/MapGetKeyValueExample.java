package data_structures;


import java.util.HashMap;
import java.util.Map;

public class MapGetKeyValueExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        String[] arr = {"Alex", "Ben", "Max"};
        for (int i = 0; i < 3; i++) {
            map.put(i, arr[i]);
            //map.entrySet() возвращает набор ключ-значений,
            // потому самым эффективным способом пройтись по всем значениям Map будет:
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}
