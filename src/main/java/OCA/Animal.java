package OCA;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    Animal() {
        this(makeRandomName());
    }

    private static String makeRandomName() {
        int x = (int) (Math.random() * 5);

        String name = new String[]
                {"Fluffy", "Fido", "Rover", "Spike", "Gigi"}[x];

        return name;
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.name);

        Animal b = new Animal("Zeus");
        System.out.println(b.name);
    }
}
