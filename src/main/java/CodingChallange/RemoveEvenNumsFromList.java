package CodingChallange;

import java.util.*;

public class RemoveEvenNumsFromList {


    public static void main(String[] args) {
        removeEvensAndPrintOddNumbers();
    }

    static void removeEvensAndPrintOddNumbers() {

        List<Integer> integers = new ArrayList<>(Arrays.asList(3, 2, 7, 4, 5));

        for (int i = 0; i < integers.size(); i++) {

            Iterator iterator = integers.iterator();

            while (iterator.hasNext()) {
                if ((int) iterator.next() % 2 == 0) {
                    iterator.remove();
                    break;
                }
            }
        }
        System.out.println(integers);
    }
}




