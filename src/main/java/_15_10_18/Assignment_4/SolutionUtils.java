package _15_10_18.Assignment_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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

    public static void doNothing() {
        System.out.println("Looser is doing nothing");
    }

    public static void enjoy() {
        System.out.println("Proger is enjoying");
    }

    public static Object createPerson(List<Object> list) {
        if (list.isEmpty())
            return null;

        Object object = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            Object anotherObject = list.get(i);
            if (object.equals("looser")) {
                new Looser();
                object = anotherObject;
            } else if (object.equals("user")) {
                new User();
                object = anotherObject;
                break;
            } else if (object.equals("coder")) {
                new Coder();
                object = anotherObject;
                break;
            } else if (object.equals("proger")) {
                new Proger();
                object = anotherObject;
                break;
            } else {
                break;
            }
        }
        return object;
    }

    public static void doWork(Object o) {
        if (o.equals("user")) SolutionUtils.live();
        else if (o.equals("coder")) SolutionUtils.coding();
        else if (o.equals("looser")) SolutionUtils.doNothing();
        else if (o.equals("proger")) SolutionUtils.enjoy();
    }
}

