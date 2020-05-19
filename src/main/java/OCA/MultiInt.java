package OCA;

public class MultiInt implements I1, I2 {

    @Override
    public int doStuff() {
        return 3;
    }

    public static void main(String[] args) {
        new MultiInt().go();
        doStuffy();

    }

    void go() {
        System.out.println(doStuff());
    }

    public static String doStuffy() {
        return "hello";
    }

}
