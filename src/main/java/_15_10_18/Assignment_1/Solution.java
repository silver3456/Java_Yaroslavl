package _15_10_18.Assignment_1;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Enter cat");
            String str = reader.readLine();
            if (str.isEmpty())
                break;

            Cat cat = CatFactory.getCatByKey(str);
            cat.printCat();
        }
    }

}