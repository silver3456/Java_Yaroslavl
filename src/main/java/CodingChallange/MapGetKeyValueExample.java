package CodingChallange;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapGetKeyValueExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        String[] arr = {"Alex", "Ben", "Max"};
        for (int i = 0; i < 3; i++) {
            map.put(i, arr[i]);
            //Map.entrySet() возвращает набор ключ-значений,
            // потому самым эффективным способом пройтись по всем значениям Map будет:
        }

        for (Entry<Integer, String> entry : map.entrySet()) {
            //получить ключ
            int key = entry.getKey();

            //получить значение
            String value = entry.getValue();

            System.out.println(key + " " + value);

        }
    }
}
