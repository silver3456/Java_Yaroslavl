package _16_09_18.Assignment_1;

import java.util.HashSet;
import java.util.Set;

public class TestDog {
    public static void main(String[] args) {

        Dog d1 = new Dog("Bobik", 5);
        Dog d2 = new Dog("Bobik", 5);

        Set<Dog> dogs = new HashSet<>();
        dogs.add(d1);
        dogs.add(d2);

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());

        boolean ques = d1.equals(d2);
        System.out.println(ques);
        System.out.println(dogs.size());
    }

}

