package CodingChallange;

abstract class Animal {

    public void nonAbstract() {
        System.out.println("Non-abstract");
    }

    abstract void abstrMethod(String name);
}
