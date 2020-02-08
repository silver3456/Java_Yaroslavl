package OCA;

public class Happy {
    int id;
    Happy(int i) {
        id = i;
    }

    public static void main(String[] args) {
        Happy h1 = new Happy(1);
        Happy h2 = h1.go(h1);
    }

    Happy go(Happy h) {
        Happy h3 = h;
        h3.id = 2;
        return null;
    }
}
