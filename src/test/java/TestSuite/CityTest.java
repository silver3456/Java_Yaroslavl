package TestSuite;

import _16_09_18.City;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CityTest {

    @Test

    public void testCity() {

        List<City> cities = new ArrayList<>();
        cities.add(new City("New York", 1000));
        cities.add(new City("Boston", 900));
        cities.add(new City("Miami", 800));
        cities.add(new City("Chicago", 600));

        for (City city : cities) {
            System.out.println(city);
        }

        cities.sort((o1, o2) -> o1.getCitizens() > o2.getCitizens() ? 1 : -1);
        for (City city : cities) {
            System.out.println(city);
        }
    }
}
