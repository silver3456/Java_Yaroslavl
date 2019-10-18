package data_structures.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {
    public static void main(String args[]) {
        // Creating an empty HashSet
        HashSet<String> set = new HashSet<String>();

        // Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");


        // Displaying the HashSet
        System.out.println("HashSet: " + set);

        // Creating an iterator
        Iterator value = set.iterator();

        while (value.hasNext()) {
            System.out.println("Next value is: " + value.next());
        }


        // Displaying the values after iterating through the set
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {

            //Remove element during iteration
            if (value.next().equals("4")) {
                value.remove();
                System.out.println("After element removal" + set);
            }



        }

    }
}