package _16_09_18.Assignment_1;

import java.util.Objects;
import java.util.Set;

public class Employee{

    private String lastName;
    private Integer salary;

    public Employee(){

    }

    public Employee(String lastName, int salary) {
        setLastName(lastName);
        setSalary(salary);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer  getSalary() {
        return salary;
    }

    public void setSalary(Integer  salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, salary);
    }
}
