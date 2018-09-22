package _16_09_18.Assignment_1;

import java.util.Iterator;
import java.util.Set;

public class EmployeeUtils {
    public static boolean removeEmployee(Set<Employee> employees, int salaryValue) {
        if (employees.isEmpty())
            return false;

        employees.removeIf((Employee emp) -> emp != null ? emp.getSalary() < salaryValue : false);
        return true;
    }

    public static void printEmployees(Set<Employee> employees) {
        Iterator<Employee> iter = employees.iterator();
        while (iter.hasNext()) {
            Employee emp = iter.next();
            if (emp != null)
                System.out.print(emp.toString() + " ");
        }
        System.out.println();
    }
}
