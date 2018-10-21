package _15_10_18.Assignment_4;

public class Coder implements Person {

    private String name;
    private int age;

    public Coder() {
    }

    public Coder(String name, int age) {
       setAge(age);
       setName(name);
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

    public void coding() {
        System.out.println("Coder is coding");
    }
}
