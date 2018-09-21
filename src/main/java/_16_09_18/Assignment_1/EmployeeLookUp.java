package _16_09_18.Assignment_1;

import java.util.HashSet;
import java.util.Set;

public class EmployeeLookUp {

    public static void main(String[] args) {

        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("Ivanov", 10000));

        employees.add(new Employee("Petrov", 20000));
        employees.add(new Employee("Petrov", 20000));

        employees.add(new Employee("Volkov", 30000));

        employees.add(new Employee("Sidorov", 40000));
        employees.add(new Employee("Sidorov", 40000));


        for (Employee employee : employees) {
            System.out.println(employee + " ");
            if (employee.hashCode() == employees.hashCode() && employee.equals(employees)) {
                System.out.println("Person " + employee + " equals to employee " + employees);
            }
        }

        System.out.println();

        Employee.removeEmployee(employees);
    }
}





