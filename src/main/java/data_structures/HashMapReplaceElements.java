package data_structures;

import java.util.HashMap;
import java.util.Map;

public class HashMapReplaceElements {

    public static void main(String[] args) {

        Map<Integer, String> hm = new HashMap<>();
        System.out.println("Initial list of elements: " + hm);
        hm.put(100, "Alex");
        hm.put(101, "Ben");
        hm.put(102, "Den");

        System.out.println("Initial list of elements ");

        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");

        hm.replace(102, "Gaurav");
        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        
    }
}
