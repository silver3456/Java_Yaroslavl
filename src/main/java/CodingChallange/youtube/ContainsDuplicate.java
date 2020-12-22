package CodingChallange.youtube;


/*
https://www.youtube.com/watch?v=qg0CY00qJqI&list=PLi9RQVmJD2fYXgBAUfaN5MXgYPUTbzqeb&index=6
 */


import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 4, -1};

        System.out.println(containsDuplicate(arr));

    }

    /**
     * I am going to propose that we use HashSet to remember what we've seen before
     * because our HashSet offers very fast lookup time
     *
     */
    private static boolean containsDuplicate(int[] numbers) {

        Set<Integer> set = new HashSet<>();

        for (int i : numbers) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }

        return false;

    }
}

