package JavaRush.Assignment_1.Assignment_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number:");

            String num = reader.readLine();
            int enteredNum = Integer.parseInt(num);

            list.add(enteredNum);
        }
        list.sort((o1, o2) -> -o1.compareTo(o2));

        System.out.println("Sorted descending" + list);


    }
}
