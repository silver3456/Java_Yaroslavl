package CodingChallange;

public class Child extends Parent {
    public static void main(String[] args) {

        Child child = new Child();
        child.age = 5;
        child.name = "Bob";
        System.out.println(child.toString());
        child.doSomething();
        child.doSomething();
    }

    @Override
    public String toString() {
        return age + " " + name;
    }
    @Override
    public void doSomething() {
        super.doSomething();
        //System.out.println("Child class");
    }
}
