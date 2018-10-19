package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortString {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Andrew");
        list.add("Zebra");
        list.add("Washington");
        list.add("San Francsico");
        list.add("Los Angeles");

        //sort ascending with lambda
        Collections.sort(list, ((o1, o2) -> o1.compareTo(o2)));


        //sort ascending with method reference
        Collections.sort(list, String::compareTo);

        //sort descending
        Collections.sort(list, (o1, o2) -> -o1.compareTo(o2));
        System.out.println(list);
    }
}
