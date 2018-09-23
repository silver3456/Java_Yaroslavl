import _16_09_18.Assignment_1.Employee;
import _16_09_18.Assignment_1.EmployeeUtils;
import _16_09_18.Assignment_2.EmployeeTreeSet;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class EmployeeTest {

    @Test

    public void testRemoveEmp() {
        System.out.println("First method");
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("Serov", 10000));
        employees.add(new Employee("Kabanov", 20000));
        employees.add(new Employee("Pukhov", 30000));
        employees.add(new Employee("Spassky", 40000));
        employees.add(null);

        EmployeeUtils.printEmployees(employees);
        EmployeeUtils.removeEmployee(employees, 30000);
        Assert.assertEquals(3, employees.size());
        EmployeeUtils.printEmployees(employees);
    }

    @Test
    public void testTreeSetEmp() {
        System.out.println("Second method");
        Set<Employee> employees = new TreeSet<>(Comparator.comparing(Employee::getSalary));

        //Literal array
        Employee[] employeeArray = new Employee[]{new Employee("Egorov", 10000),
                new Employee("Prohorov", 15000),
                new Employee("Saraev", 9000),
                new Employee("Pukhov", 13000),
                new Employee("Medvedev", 20000),
                new Employee("Egorov", 10000),
                new Employee("Prohorov", 15000),
                new Employee("Saraev", 9000),
                new Employee("Pukhov", 13000),
                new Employee("Medvedev", 20000)};

        EmployeeUtils.addEmployees(employeeArray, employees);

        EmployeeUtils.printEmployees(employees);

        Set<Employee> emp = new TreeSet<>(Comparator.comparing(Employee::getLastName));
        EmployeeUtils.addEmployees(employeeArray, emp);

        EmployeeUtils.printEmployees(emp);
    }

    @Test

    public void testFilterEmpOne() {

        System.out.println("Third method");
        Set<Employee> employees = new TreeSet<>(Comparator.comparing(Employee::getLastName));

        //Literal array
        Employee[] employeeArray = new Employee[]{new Employee("Egorov", 10000),
                new Employee("Prohorov", 15000),
                new Employee("Saraev", 9000),
                new Employee("Pukhov", 13000),
                new Employee("Medvedev", 20000),
                new Employee("Egorov", 10000),};

        EmployeeUtils.addEmployees(employeeArray, employees);
        EmployeeUtils.printEmployees(employees);

        EmployeeUtils.filterEmployeeOne(employees, "p");
        Assert.assertEquals(3, employees.size());
        EmployeeUtils.printEmployees(employees);
    }
}
