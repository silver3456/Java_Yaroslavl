package OCA;

public class Ouch {
    static int ouch = 7;

    public static void main(String[] args) {
        new Ouch().go(ouch);
        System.out.print(" " + ouch);
    }

    private void go(int ouch) {
        ouch++;
        for (ouch = 3; ouch < 4; ouch++);
        System.out.print(" " + ouch);
    }
}
