package java8;

import java.util.ArrayList;
import java.util.List;

public class ManFactory {

    public static List<Man> createMen() {
        List<Man> persons = new ArrayList<>();

        Man m1 = new Man();
        m1.setName("Alex").setAge(20).setGender("male");

        persons.add(m1);

        Man m2 = new Man();
        m2.setName("Sveta").setAge(19).setGender("female");

        persons.add(m2);

        Man m3 = new Man();
        m3.setName("Vito").setAge(18).setGender("male");

        persons.add(m3);


        return persons;
    }
}
