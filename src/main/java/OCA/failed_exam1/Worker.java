package OCA.failed_exam1;

public class Worker extends Employee{

    public static void main(String[] args) {
        Manager m1 = new Manager();
        Manager m2 = new Employee();
        Manager m3 = new Worker();

        m1.salary = 5;
        m2.salary = 6;
        m3.salary = 7;


    }
}
