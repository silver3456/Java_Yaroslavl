package OCA.oca_answers;

public class A {

    public void test() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        A b1 = new A();
        A b2 = new C();
        B c1 = new B();
        b1 = (A)b2;
        A b3 = (B)b2;
        A b4 = (A)c1;
//        b3.test();
        b4.test();

    }


}

class B extends  A {

    public void test() {
        System.out.println("B");
    }

}

class C extends A {

    public void test() {
        System.out.println("C");
    }

}
