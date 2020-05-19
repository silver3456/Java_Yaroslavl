package java8;

import java.util.function.Predicate;

public class PersonPredicates {

    public static Predicate<Man> malePersonPredicate = p -> p.getGender().equals("male");
    public static Predicate<Man> agePersonPredicate = p -> p.getAge() > 18;

}
