package _09_09_18.Assignment_4;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Михаил ", "Иванов", 17));
        person.add(new Person("Евгений ", "Тетерев", 25));
        person.add( new Person("Алексей ", "Федоров", 15));
        person.add(new Person("Марина ", "Олексенко", 13));
        person.add( new Person("Виктория", "Кравцова", 25));

        Person p = Person.findPerson(person);

        System.out.print(p.getFirstName() + " " + p.getLastName() + " age " + p.getAge());
    }
}
