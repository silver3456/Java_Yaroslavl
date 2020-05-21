package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx2 {
    public static void main(String[] args) {
        List<Man> persons = ManFactory.createMen();
        List<Man> filteredList = getFilteredPerson(persons, PersonPredicates.malePersonPredicate
                .and(PersonPredicates.agePersonPredicate));
        filteredList.forEach(System.out::println);
    }

    public static List<Man> getFilteredPerson(List<Man> men, Predicate<Man> personsPredicate) {
        List<Man> filteredPersons = new ArrayList<>();
        for (Man man : men) {
            if (personsPredicate.test(man)) {
                filteredPersons.add(man);
            }
        }
        return filteredPersons;

    }
}
