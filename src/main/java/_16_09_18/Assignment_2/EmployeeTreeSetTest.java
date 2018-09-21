package _16_09_18.Assignment_2;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class EmployeeTreeSetTest {
    public static void main(String[] args) {

        SortedSet<EmployeeTreeSet> employees = new TreeSet<>(new EmployeeTreeSet.MyComparator());
        employees.add(new EmployeeTreeSet("Egorov", 10000));
        employees.add(new EmployeeTreeSet("Prohorov", 15000));
        employees.add(new EmployeeTreeSet("Saraev", 9000));
        employees.add(new EmployeeTreeSet("Pukhov", 13000));
        employees.add(new EmployeeTreeSet("Medvedev", 20000));

//        Iterator<EmployeeTreeSet> it = employees.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next().getSalary());
//        }

        for (EmployeeTreeSet emp : employees)
            System.out.println(emp + " ");
        System.out.println();

        SortedSet<EmployeeTreeSet> emp = new TreeSet<>(new EmployeeTreeSet.ComparatorTwo());
        emp.add(new EmployeeTreeSet("Zverev", 30000));
        emp.add(new EmployeeTreeSet("Avdeev", 12000));
        emp.add(new EmployeeTreeSet("Romanov", 19000));
        emp.add(new EmployeeTreeSet("Matveev", 45000));
        emp.add(new EmployeeTreeSet("Sorokin", 39000));

        for (EmployeeTreeSet emp2 : emp)
            System.out.println(emp2 + " ");
    }

}