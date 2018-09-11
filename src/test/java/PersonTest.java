import _09_09_18.Assignment_4.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    @Test

    public void testFindPerson() {
        Person personOne = new Person("John", "Malkovich");
        personOne.setAge(20);

        Person personTwo = new Person("Andrew", "McGregar");
        personTwo.setAge(23);

        Person personThree = new Person("Alex", "Boldooin");
        personThree.setAge(31);

        List<Person> personList = new ArrayList<>();
        personList.add(personOne);
        personList.add(personTwo);
        personList.add(personThree);

        int personAge = Person.findPerson(personList);

        Assert.assertEquals(20, personAge);
        System.out.print("Person with min age " + personAge);
    }
}
