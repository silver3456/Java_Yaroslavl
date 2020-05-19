package OCA;

public class Telescope {
    static int magnify = 2;

    public static void main(String[] args) {
        go();
    }

    private static void go() {
        int magnify = 3;
        zoomIn();
    }

    private static void zoomIn() {
        magnify*=5;
        zoomMore();
        System.out.println(magnify);
    }

    private static void zoomMore() {
        magnify*=7;
    }
}
