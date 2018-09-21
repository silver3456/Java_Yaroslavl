package _16_09_18.Assignment_1;

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

    @Override
    public int hashCode() {
        return getLastName().hashCode();
    }

    @Override
    public boolean equals(Object emp) {
        Employee e = (Employee) emp;//Почему такая запись?
        return getLastName().equals(e.getLastName());
    }

    public static int removeEmployee(Set<Employee> employees) {
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
}
