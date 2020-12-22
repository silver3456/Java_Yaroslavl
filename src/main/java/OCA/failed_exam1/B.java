package OCA.failed_exam1;

public class B extends A {


    private void run() {
        System.out.println("run() in B");

    }


    protected void walk() {

    }

    public static void main(String[] args) {
        A obj = new B();
        ((B) obj).run();

        int a = Integer.MIN_VALUE;

        int b = -a;
        System.out.println(a + " " + b);

        short s = 124;

        char c = (char) s;


    }


}
