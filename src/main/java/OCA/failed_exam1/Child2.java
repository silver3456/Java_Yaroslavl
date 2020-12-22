package OCA.failed_exam1;

public class Child2 extends Child1{

    int salary = 4;

    public static void main(String[] args) {

        Parent p1 = new Parent();
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();

        int a = 12;
        float f = 11.0f;

        f = a;
        System.out.println(f);


        p1 = ch1;
        ch1 = ch2;


        System.out.println(p1.salary);
        System.out.println(ch1.salary);
        System.out.println(ch2.salary);


    }
}
