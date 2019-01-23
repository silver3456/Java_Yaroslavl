package _01_23_19;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("232343345", 1000.50);
        BankAccount acc2 = new BankAccount("652343345", 2000);
        BankAccount acc3 = new BankAccount("962343345", 3000);

        acc1.setName("Jim");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.makeDeposit(600);
        acc1.payBill(1000);
        acc1.accrue();
        System.out.println(acc1.toString());
    }
}

class BankAccount implements IInterest {
    //Properties of bank account
    private static int iD = 1000; //Internal ID
    private String accountNumber;// ID + random 2-digit number + first 2 of SSN
    private static final String ROUTING_NUMBER = "0054000657";
    private String name;
    private String SSN;
    private double balance;

    //Constructor definitions: unique methods
    //1.They are used to define /setup /initialize properties of an object
    //2.Constructors are IMPLICITLY(неявно)call upon INSTANTIATION (во время создания экземпляра)
    //3.The same name as the class itself
    //4.Constructors have NO return type

    public BankAccount(String SSN, double initDeposit) {
        balance = initDeposit;
        this.SSN = SSN;
        iD++;
        setAccountNumber();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        int random = (int) (Math.random() * 100);
        accountNumber = iD + "" + random + SSN.substring(0, 2);
        System.out.println("Your Account Number: " + accountNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void payBill(double amount) {
        System.out.println("Paying bill: " + amount);
        balance = balance - amount;
        showBalance();

    }

    public void makeDeposit(double amount) {
        System.out.println("Making deposit: " + amount);
        balance = balance + amount;
        showBalance();
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }

    //Add interest
    @Override
    public void accrue() {
        balance = balance * (1 + rate / 100);
        showBalance();
    }

    @Override
    public String toString() {
        return "[Name: " + name + "]\n" + "[Account Number: " + accountNumber + "]\n" +
                "[Routing Number: " + ROUTING_NUMBER + "]\n" + "[Balance: " + balance + "]";
    }
}


