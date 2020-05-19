package OCA;

public class Happy {
    int id;
    Happy(int i) {
        id = i;
    }

    public static void main(String[] args) {
        Happy h1 = new Happy(1);
        Happy h2 = h1.go(h1);
        System.out.println(h1.id);
    }

    Happy go(Happy h) {
        Happy h3 = h;
        Happy h1 = h;
        h1.id = 6;
        h3.id = 7;

        return h1;
    }
}
