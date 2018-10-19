package _13_10_18;

public class Test {
    public static void main(String[] args) {

        C c = new C();
        c.sayHi(new B());
        c.sayHi(new D());
        c.sayHi(()->{
            System.out.println("Lambda");
        });
        c.sayHi(new T() {
            @Override
            public void doSomething() {
                System.out.println("Anonim class");
            }
        });


       
    }
}
