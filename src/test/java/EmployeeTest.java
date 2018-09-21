import _16_09_18.Assignment_1.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {

    @Test

    public void testRemoveEmp() {

        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("Serov", 10000));
        employees.add(new Employee("Kabanov", 20000));
        employees.add(new Employee("Pukhov", 30000));
        employees.add(new Employee("Spassky", 40000));

        for (Employee employee : employees) {
            System.out.println(employee + " ");
        }
        System.out.println();
        Assert.assertEquals(3, Employee.removeEmployee(employees));
    }
}
