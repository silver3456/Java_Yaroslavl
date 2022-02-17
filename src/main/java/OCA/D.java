package OCA;

public class D extends C {

    public static void main(String[] args) {

        D d = new D();
        d.age = 7;
        new C().age = 8;

        System.out.println(d.age);
    }
}
