package java_materials;

import java.util.*;

public class Collections {
    public static void main(String[] args) {


//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("1", 1);
//        map.put("3", 3);
//        map.put("20", 2);
//        map.put("4", 4);
//        map.put("9", 9);
//        map.remove(3);
//        System.out.println(map);

//        HashSet<Integer> set = new HashSet<>();
//        set.add(4);
//        set.add(4);
//        set.add(1);
//        set.add(null);
//        System.out.println(set);

        Map<Integer, Integer> map = new TreeMap<>((o1, o2) -> o1.compareTo(o2));
        map.put(1, 1);
        map.put(3, 3);
        map.put(20, 2);
        map.put(4, 4);
        map.put(9, 9);
        System.out.println(map);


    }
}
