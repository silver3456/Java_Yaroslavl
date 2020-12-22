package OCA;

class C extends A implements Gadget {

    public void doStuff() {
        Gadget.super.doStuff();
        System.out.println("C");
    }

    static final int speed;

    static {
        speed = 8;
    }

    int age = 8;

    public static void main(String[] args) {

        Gadget c = new C();
        c.doStuff();
    }
}
