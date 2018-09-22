package _22_09_18.Assignment_3;

import _16_09_18.Assignment_1.Employee;
import _16_09_18.Assignment_1.EmployeeUtils;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 167);
        Set d;

        System.out.println(map.get("aaa"));

        Map<String, Employee> emp = new HashMap<>();
        emp.put("lastname", new Employee());

        Map<Employee, Set<Employee>> obj = new HashMap<>();
        Set<Employee> employees = new HashSet<>();
        EmployeeUtils.addEmployees(new Employee[]{
                new Employee(),
                new Employee()
        }, employees);

        obj.put(new Employee("начальник", 2), employees);

    }
}
