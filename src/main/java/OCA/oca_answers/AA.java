package OCA.oca_answers;

public class AA {

    void run() {
        System.out.println("AA");
    }

    public static void main(String[] args) {

        AA obj1 = new AA();
//        obj1.run();

        CC cc = new CC();

        AA obj2 = new BB();
//        obj2.run();

        BB obj3 = new BB();

        AA obj4 = (BB)cc;
        obj4.run();



    }
}

class BB extends AA {
    void run() {
        System.out.println("BB");
    }

}

class CC extends  BB {

    void run() {
        System.out.println("CC");
    }
}
