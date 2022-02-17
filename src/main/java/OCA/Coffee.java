package OCA;

public class Coffee extends Plant{

    void run() {
        System.out.println("Coffee");
    }

    public static void main(String[] args) {
        Plant p1 = new Java();
        Plant p2 = new Coffee();
        Plant p3 = new Java();
        p1 = (Coffee)p3;
        Plant p4 = (Coffee)p3;
        Coffee p6 = (Java)p2;

        Plant p5 = (Java)p2;
        p1.run();
        p4.run();
        p5.run();
    }



}




