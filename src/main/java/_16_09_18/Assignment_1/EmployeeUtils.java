package _16_09_18.Assignment_1;


import org.apache.commons.lang.StringUtils;

import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;


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

    static public void addEmployees(Employee[] employees, Set<Employee> target) {
        if (employees == null || target == null) throw new NullPointerException("Employees or target is null");
        for (int i = 0; i < employees.length; i++) {
            target.add(employees[i]);
        }
    }

    public static boolean filterEmployeeOne(Set<Employee> emp, String letter) {
        if (emp.isEmpty())
            return false;

        emp.removeIf((Employee e) -> e != null && e.getLastName().contains(letter));
        return true;
    }

    public static boolean filterEmployeeTwo(Set<Employee> emp2, char letter2) {
        if (emp2.isEmpty())
            return false;

        Set<Employee> removed = emp2.stream().filter(employee -> {
            int index = employee.getLastName().toLowerCase().indexOf(letter2);
            return index != -1;
        }).collect(Collectors.toSet());
        emp2.removeAll(removed);
        return true;
    }
}

