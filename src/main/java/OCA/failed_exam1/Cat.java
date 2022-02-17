package OCA.failed_exam1;


public class Cat extends Animal {

    String name;

    public void sleep(){
        System.out.println("cat is sleeping");
    }

    public static void main(String[] args) {
        Animal obj = new Cat();
        Animal obj2 = new Animal();
        Cat c = new Cat();


        obj.a = obj2;
        obj2.a = c;


        obj =  c;
//        obj2 = obj;

        obj = null;
        obj2 = null;


        obj.sleep();
//        obj2.sleep();
        c.sleep();







    }
}
