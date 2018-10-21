package _15_10_18.Assignment_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SolutionUtils {
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

    public static void doWork(Person o) {
       // String className = o.getClass().getSimpleName();
        if (o instanceof User) SolutionUtils.live();
        else if (o instanceof Coder) SolutionUtils.coding();
        else if (o instanceof Looser) SolutionUtils.doNothing();
        else if (o instanceof Proger) SolutionUtils.enjoy();
    }
}

