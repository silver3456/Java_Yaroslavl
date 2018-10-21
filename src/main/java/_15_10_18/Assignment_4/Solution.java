package _15_10_18.Assignment_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws IOException {
        ArrayList<String> keys = new ArrayList<>();
        ObjectFactory factory = new ObjectFactory();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final String[] words = {"user", "looser", "coder", "proger"};

        LOOP:
        while (true) {
            System.out.println("Enter key");
            String str = reader.readLine();

            for (String var : words) {
                if (str.equals(var)) {
                    keys.add(str);
                    continue LOOP;
                }
            }
            break;
        }

        if (keys.isEmpty())
            return;

        for(String key : keys){
            SolutionUtils.doWork(factory.createObjectByKey(key));
        }
    }
}
