package OCA.oca_answers;

//https://vceguide.com/what-is-the-result-495/


public class Test {
    public static void main(String[] args) {

        int x = 1;
        int y = 1;
        if (x++ < ++y) {
            System.out.println("Hello");
        } else {
            System.out.println("Welcome");
        }
        System.out.println("Log " + x + ":" + y);
    }
}
