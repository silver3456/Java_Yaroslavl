package _09_09_18.Assignment_4;

import java.util.ArrayList;
import java.util.List;

public class Person {

    static String firstName;
    static String lastName;
    private int age;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int withAge() {
        return age;
    }

    public static void main(String[] args) {


        Person personOne = new Person("Михаил ", "Иванов");
        personOne.setAge(17);

        Person personTwo = new Person("Евгений ", "Тетерев");
        personTwo.setAge(20);

        Person personThree = new Person("Алексей ", "Федоров");
        personThree.setAge(15);

        Person personFour = new Person("Марина ", "Олексенко");
        personFour.setAge(13);

        Person personFive = new Person("Виктория", "Кравцова");
        personFive.setAge(25);


        List<Person> person = new ArrayList<>();
        person.add(personOne);
        person.add(personTwo);
        person.add(personThree);
        person.add(personFour);
        person.add(personFive);

        int personAge = findPerson(person);

        System.out.print(firstName + " " + lastName + " age " + personAge);
    }

    public static int findPerson(List<Person> man) {

        int minAge = man.get(0).withAge();

        for (int i = 1; i < man.size(); i++) {
            if (minAge > man.get(i).withAge()) {
                minAge = man.get(i).withAge();
            }
        }
        return minAge;
    }
}
