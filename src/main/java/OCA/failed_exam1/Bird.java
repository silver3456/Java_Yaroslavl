package OCA.failed_exam1;

public class Bird {

    static int go() {

        int a = 0;
        int b = 0;

        try {
            return a / b;
        } catch (ArithmeticException  e) {
            return -1;
        } catch (RuntimeException e) {
            return 0;
        } finally {
            System.out.println("done");

        }
    }


    public static void main(String[] args) {


    }
}