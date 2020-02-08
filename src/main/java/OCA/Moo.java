package OCA;

public class Moo extends Zoo {
    public static void main(String[] args) {
        Zoo z = new Zoo();
        System.out.println(z.coolMethod());
        Moo m = new Moo();
        m.useMyCoolMethod();

    }

    public void useMyCoolMethod() {
        System.out.println(coolMethod());
    }
}
