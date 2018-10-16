package _15_10_18.Assignment_1;

public class Cats {

    private String name;

    public Cats() {

    }

    public Cats(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                '}';
    }
}
