package _16_09_18.Assignment_1;

import java.util.Objects;
import java.util.Set;

public class Employee {

    private String lastName;
    private int salary;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public static int removeEmployee(Set<Employee> employees) {
        if(employees.isEmpty())
            return Integer.parseInt(null);

        employees.removeIf((Employee emp) -> emp.getSalary() == 30000);
        for (Employee employee : employees) {
            System.out.println("List of employees after removing" + "\n" + employee + " ");
        }
        return employees.size();
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
