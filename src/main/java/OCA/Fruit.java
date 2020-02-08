package OCA;

public class Fruit {

    String name;
    int weight;

    public Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public static void main(String[] args) {


        Fruit fruit = new Fruit("apple", 10);

        System.out.println(Fruit.class.getName());
        System.out.println(fruit.getClass().getName());


    }
}
