package _16_09_18.Assignment_2;

import java.util.Comparator;
import java.util.Objects;

public class EmployeeTreeSet {

    private String lastName;
    private int salary;

    public EmployeeTreeSet(String lastName, int salary) {
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static class MyComparator implements Comparator<EmployeeTreeSet> {

        @Override
        public int compare(EmployeeTreeSet o1, EmployeeTreeSet o2) {
            if (o1.getSalary() > o2.getSalary())
                return -1;
            else if (o1.getSalary() < o2.getSalary())
                return 1;

            else return 0;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeTreeSet)) return false;
        EmployeeTreeSet that = (EmployeeTreeSet) o;
        return salary == that.salary &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, salary);
    }

    @Override
    public String toString() {
        return "EmployeeTreeSet{" +
                "lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
