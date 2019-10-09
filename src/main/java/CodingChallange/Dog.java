package CodingChallange;

public class Dog extends Animal {
//    @Override
//    void abstrMethod() {
//        System.out.println("Abstract method");
//    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.nonAbstract();
        d.abstrMethod("");
    }

    @Override
    void abstrMethod(String name) {

    }
}
