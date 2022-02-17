package OCA.failed_exam1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {

    static void run() throws FileNotFoundException {
//        System.out.println("run");
        throw new FileNotFoundException("exception");
    }

    void swim() {
        System.out.println("swim in Dog");
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog());
        list.add(new Animal());
//        System.out.println(list);

        try {
            run();
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        Dog obj = new Dog();
        obj.swim();
    }
}
