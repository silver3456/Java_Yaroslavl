package TestSuite;

import _09_09_18.Assignment_4.Person;
import _09_09_18.Assignment_4.TestObj;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    @Test

    public void testFindPerson() {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Михаил ", "Иванов", 17));
        person.add(new Person("Евгений ", "Тетерев", 25));
        person.add( new Person("Алексей ", "Федоров", 15));
        person.add(new Person("Марина ", "Олексенко", 13));
        person.add( new Person("Виктория", "Кравцова", 25));

        Person p = Person.findPerson(person);

        System.out.println(p.getFirstName() + " " + p.getLastName() + " age " + p.getAge());

        Assert.assertEquals(13, p.getAge());
    }

    @Test
    public void t(){
        TestObj first = new TestObj();
        first.val = "first";

        first.next = new TestObj();
        first.next.val = "second";

        first.next.next = new TestObj();
        first.next.next.val = "third";

        if(first.next.next.next == null){
            System.out.println("End");
        }
    }
}
