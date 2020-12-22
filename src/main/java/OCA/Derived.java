package OCA;

public class Derived extends Base {

    public static void main(String[] args) {

        Derived d = new Derived();
        Base b = new Base();

        d = (Derived)(Winter)b;

        Winter w = new Base();
    }
}
