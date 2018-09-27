package _22_09_18.Assignment_3.Assignment_1;

import java.util.Comparator;

public class FruitsPriceCompare {

    public static Object ComporatorOne;

    public static class ComporatorOne implements Comparator<Fruits> {

        @Override
        public int compare(Fruits o1, Fruits o2) {
            return o1.getPrice().compareTo(o2.getPrice());
        }
    }

}

