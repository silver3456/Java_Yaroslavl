package OCA;

public class BankAccount {

    static int count = 0;
    int a = 0;
    public void rampUp() {
        while (a < 10) {
            a++;
            count++;
        }
    }
    public static void main(String[] args) {
        BankAccount p1 = new BankAccount();
        BankAccount p2 = new BankAccount();
        p1.rampUp();
        p2.rampUp();
        System.out.print("p1.count = " + p1.count + ", p2.count = " + p2.count);
    }
}
