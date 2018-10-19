package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class ListSortInteger {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(3);
        list.add(9);
        list.add(1);

        //list.sort((Integer::compareTo)); //ascending order
        list.sort(((o1, o2) -> -o1.compareTo(o2))); //descending order
        System.out.println(list);
    }
}
