package CodingChallange;

import java.util.HashMap;
        import java.util.Map;

/**
 * Problem: Write a program which accepts a list of numbers and then the number to be
 * searched and find out the number of occurrence.
 * <p>
 * Example: 12365456: 6 => 2
 */

class NumOfOccurences {
    public static void main(String[] args) {

        int num = 1236545666;

        System.out.println(numOfOccurence(num, 6));


    }

    private static int numOfOccurence(int input, int target) {

        int count = 0;
        Map<Integer, Integer> mapOfNums = new HashMap<>();

        while (input != 0) {

            int numToSearch = input % 10;

            if (numToSearch == target && mapOfNums.containsKey(numToSearch)) {
                count = mapOfNums.get(numToSearch);
                mapOfNums.put(numToSearch, count + 1);
            } else {
                mapOfNums.put(numToSearch, 1);
            }

            input = input / 10;
        }
        return mapOfNums.get(target);
    }
}
