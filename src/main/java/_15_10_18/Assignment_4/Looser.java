package _15_10_18.Assignment_4;

public class Looser implements Person {

    private String name;
    private int age;

    public Looser() {
    }

    public Looser(String name, int age) {
        setName(name);
        setAge(age);
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

    public void doNothing() {
        System.out.println("Looser is doing nothing");
    }
}
