/*
Problem: Write a program which will count the number of occurrences of an element in a ArrayList.

Enter a series of strings (To stop type: stop)
Christina
Alex
Christina
Alex
Christina
------------
3: Christina
2: Alex
 */

package CodingChallange;

import java.util.*;
import java.util.stream.Collectors;

class CountOccurrences {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter a series of strings (To stop type: stop)");
        String text = "";
        while (!text.equals("stop")) {
            text = input.nextLine();
            if (!text.equals("stop")) {
                list.add(text);
            }
        }
        input.close();

        Map<String, Integer> map = new HashMap<>();


        //Option 1
        for (int i = 0; i < list.size(); i++) {
            int occurrences = Collections.frequency(list, list.get(i));
            if (occurrences > 1) {
                map.put(list.get(i), occurrences);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }


        /*

        //Option 2 (Java 8)


        Map<String, Long> counts =
                list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        for (Map.Entry<String, Long> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

        */
    }
}

