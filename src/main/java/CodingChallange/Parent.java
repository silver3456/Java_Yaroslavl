package CodingChallange;

public class Parent {
    String name;
    int age;

    public void doSomething() {
        System.out.println("Parent class");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.doSomething();
    }

}
