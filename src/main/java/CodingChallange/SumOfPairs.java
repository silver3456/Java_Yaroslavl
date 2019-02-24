package CodingChallange;

//Write a program which will find all pairs of elements whose sum is equal to a given number

import java.util.ArrayList;
import java.util.List;

public class SumOfPairs {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(8);

        int target = 10;

        for (int j = 0; j < list.size(); j++) {
            for (int i = j + 1; i < list.size(); i++) {
                if (list.get(j) + list.get(i) == target) {
                    System.out.println(target + " = " + list.get(j) + "+" + list.get(i));
                }
            }
        }

    }
}
