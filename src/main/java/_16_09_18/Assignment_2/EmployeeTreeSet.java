package _16_09_18.Assignment_2;

import _16_09_18.Assignment_1.Employee;

import java.util.Comparator;
import java.util.Objects;

public class EmployeeTreeSet {


    public static class ComparatorOne implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
           return o1.getSalary().compareTo(o2.getSalary());
        }
    }

    public static class ComparatorTwo implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
}
