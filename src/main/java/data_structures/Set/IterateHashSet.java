package data_structures.Set;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hset = new HashSet<String>();

        //add elements to HashSet
        hset.add("Chaitanya");
        hset.add("Rahul");
        hset.add("Tim");
        hset.add("Rick");
        hset.add("Harry");

        Iterator<String> it = hset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
