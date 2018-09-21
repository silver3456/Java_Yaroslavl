package _09_09_18.Assignment_4;

//solved by myself

import java.util.List;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        setAge(age);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static Person findPerson(List<Person> man) {
        if (man.isEmpty())
            return null;

        Person person = man.get(0);
        int minAge = person.getAge();

        for (int i = 0; i < man.size(); i++) {
            Person another = man.get(i);
            int anotherAge = another.getAge();
            if (minAge > anotherAge) {
                minAge = anotherAge;
                person = another;
            }
        }

        return person;
    }
}


