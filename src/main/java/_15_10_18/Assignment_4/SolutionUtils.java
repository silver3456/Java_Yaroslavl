package _15_10_18.Assignment_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SolutionUtils {
    static ArrayList<Object> key = new ArrayList<>();

    public static void init() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LOOP:
        while (true) {
            final String[] words = {"user", "looser", "coder", "proger"};

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

    public static void coding() {
        System.out.println("Coder is coding");

    }

    public static void live() {
        System.out.println("User is alive");
    }

    public static void doNothing(){
        System.out.println("Looser is doing nothing");
    }

    public static void enjoy(){
        System.out.println("Proger is enjoying");
    }
}



