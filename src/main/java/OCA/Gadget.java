package OCA;

public interface Gadget {

    String NAME = "";

    default void doStuff() {
        System.out.println("Gadget");
    }
}
