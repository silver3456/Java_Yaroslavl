package data_structures;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        System.out.println("Initial list of elements: " + hm);
        hm.put(100, "Alex");
        hm.put(101, "Ben");
        hm.put(102, "Den");

        System.out.println("After invoking put() method ");
        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        hm.putIfAbsent(103, "Nick");
        System.out.println("After invoking putIfAbsent() method ");
        for (Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        HashMap<Integer, String> map = new HashMap<>();
        map.putAll(hm);
        System.out.println("After invoking putAll() method ");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
