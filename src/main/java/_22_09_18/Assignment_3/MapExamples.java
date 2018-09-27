package _22_09_18.Assignment_3;

import _16_09_18.Assignment_1.Employee;
import _16_09_18.Assignment_1.EmployeeUtils;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 167);
        Set d;

        // System.out.println(map.get("aaa"));

        Map<String, Employee> emp = new HashMap<>();
        emp.put("lastname", new Employee("Alex", 10000));
        //System.out.println(emp.get("lastname"));

        //Option 1
//        Map<Employee, Set<Employee>> obj = new HashMap<>();
//        Set<Employee> employees = new HashSet<>();
//
//
//        EmployeeUtils.addEmployees(new Employee[]{
//                new Employee("Serov", 1000),
//                new Employee("Ivanov", 2000)
//        }, employees);
//
//        Employee manager = new Employee("начальник", 2);
//
//        obj.put(manager, employees);
//        System.out.println(obj.get(manager));
//
        //Option 2

        Map<Employee, Set<Employee>> obj = new HashMap<>();
        Set<Employee> employees = new HashSet<>();


        EmployeeUtils.addEmployees(new Employee[]{
                new Employee("Serov", 1000),
                new Employee("Ivanov", 2000)
        }, employees);

        // Employee manager = new Employee("начальник", 2);

        obj.put(new Employee("manager", 1000), employees);

    /* Get all keys

        for(Object key : obj.keySet())
            System.out.println(key);
*/

    /* Get all values

    for(Object value : obj.values())
            System.out.println(value);
*/

  /*   Get all keys and values

    for (Map.Entry entry : obj.entrySet())
            System.out.println(entry);


*/
    }
}
