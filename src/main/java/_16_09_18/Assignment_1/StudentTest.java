package _16_09_18.Assignment_1;

public class StudentTest {

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.setName("Alex");
        st1.setAge("21");
        st1.setId("123");

        Student st2 = new Student();
        st2.setName("Alex");
        st2.setAge("21");
        st2.setId("12");

        if (st1.equals(st2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }



    }
}
