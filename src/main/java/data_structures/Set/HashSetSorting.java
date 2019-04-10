package data_structures.Set;

import java.util.*;

public class HashSetSorting {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();

        names.add("Alex");
        names.add("Luk");
        names.add("Den");
        names.add("Mark");
        names.add("Ben");

        System.out.println("HashSet before sorting" + names);

        //Sorting HashSet using list

        List<String> tempList = new ArrayList<>(names);
        Collections.sort(tempList);

        System.out.println("HashSet element in sorted order: " + tempList);

        //Sorting HashSet using TreeSet

        TreeSet<String> sorted = new TreeSet<String>(names);

        System.out.println("HashSet sorted using TreeSet" + sorted);



    }

}
