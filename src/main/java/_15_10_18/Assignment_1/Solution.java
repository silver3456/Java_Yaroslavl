package _15_10_18.Assignment_1;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Enter cat");
            String str = reader.readLine();
            if (str.isEmpty())
                break;
            list.add(str);
        }

        for (int i = 0; i < list.size(); i++) {
            Cats cat = CatFactory.getCatByKey(list.get(i));
            System.out.println(cat.toString());
        }
    }

}