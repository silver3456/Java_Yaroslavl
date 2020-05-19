package java8;

import java.util.function.Predicate;

public class IntegerPredicates {

    public static Predicate positiveIntegerPredicate = (Predicate<Integer>) i1 -> i1 > 0;
    public static Predicate negativeIntegerPredicate = (Predicate<Integer>) i1 -> i1 < 0;



    public static Predicate<Integer> getSpecificNumber(Integer argument) {
        return  i -> i == argument;
    }


}
