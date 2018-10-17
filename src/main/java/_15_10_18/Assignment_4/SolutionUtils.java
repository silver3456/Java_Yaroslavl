package _15_10_18.Assignment_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SolutionUtils {

    public static void init() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> key = new ArrayList<>();


        LOOP:
        while (true) {
            String[] words = {"user", "looser", "coder", "proger"};

            System.out.println("Enter key");
            String str = reader.readLine();

            for (String var : words) {
                if (str.equals(var)) {
                    key.add(str);
                   continue LOOP;
                }
            }
            break;
        }
    }
}



