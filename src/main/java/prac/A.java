package prac;

public class A implements Inter{

    public String s = "Alex";

    @Override
    public void run() {
        Inter.super.run();
        System.out.println("run in A");
    }

    public static void main(String[] args) {

        A obj = new A();
        obj.run();


    }
}
