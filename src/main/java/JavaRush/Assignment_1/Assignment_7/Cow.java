package JavaRush.Assignment_1.Assignment_7;

public class Cow {
    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cow(String name, int age, int weight, int strength) {
        setName(name);
        setAge(age);
        setWeight(weight);
        setStrength(strength);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean fight(Cow anotherCow) {
        if (anotherCow.strength > this.strength) {
            return false;
        } else {
            return true;
        }
    }
}
