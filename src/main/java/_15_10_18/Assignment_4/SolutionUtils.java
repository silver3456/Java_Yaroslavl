package _15_10_18.Assignment_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SolutionUtils {
    public static void doWork(Person o) {
        // String className = o.getClass().getSimpleName();
        if (o instanceof User) ((User) o).live();
        else if (o instanceof Coder) ((Coder) o).coding();
        else if (o instanceof Looser) ((Looser) o).doNothing();
        else if (o instanceof Proger) ((Proger) o).enjoy();
    }
}

