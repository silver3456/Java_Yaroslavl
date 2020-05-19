package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 4, -5, 77, -6, 4, -7, 33, 1, -3);
        List<Integer> filteredNumbers = getFilteredNumbers(numbers, IntegerPredicates.getSpecificNumber(4));

        filteredNumbers.forEach(System.out::println);
    }

    public static List<Integer> getFilteredNumbers(List<Integer> nums, Predicate<Integer> integerPredicate) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int i : nums) {
            if (integerPredicate.test(i)) {
                filteredNumbers.add(i);
            }
        }
        return filteredNumbers;

    }
}
