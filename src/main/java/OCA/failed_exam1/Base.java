package OCA.failed_exam1;

public class Base {
    public static void main(String[] args) {

        Derived d = new Derived();
        Base b = new Base();

        d = (Derived)(I)b;
    }
}
