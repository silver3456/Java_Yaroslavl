package OCA;

public interface MyInterface {
    default int doStuff() {
        return 42;
    }

    void go();
}
