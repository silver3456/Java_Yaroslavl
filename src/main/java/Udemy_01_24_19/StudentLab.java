package Udemy_01_24_19;

public class StudentLab {
    public static void main(String[] args) {

        Student student1 = new Student("Alex", "138987786");

        student1.enroll("Math333");
        student1.enroll("Eng322");
        student1.enroll("History");

//        student1.showCourses();
//        student1.checkBalance();
        student1.payTution(600);
        // student1.checkBalance();
        System.out.println(student1.toString());

    }
}

class Student implements IFinance {

    private String name;
    private String SSN;
    private String emailId; // based on the name
    private static int iD = 1000;
    private String userId; // static id + random 4-digit number between 1000 and 9000, and last 4 SSN
    private String phone;
    private String city;
    private String state;
    private String courses = "";
    private static final int COST_OF_COURSE = 800;
    private int balance = 0;


    public Student(String name, String SSN) {
        iD++;
        this.name = name;
        this.SSN = SSN;
        setEmailId();
        setUserId();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    private void setEmailId() {
        emailId = name.toLowerCase() + "." + iD + "@gmail.com";
    }

    private void setUserId() {
        int random = randomize(1000, 9000);
        userId = iD + random + SSN.substring(5, 9);
    }

    public static int randomize(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public void enroll(String course) {
        this.courses = this.courses + "\n" + course;
//        System.out.println(courses);
        balance = balance + COST_OF_COURSE;

    }

    @Override
    public void checkBalance() {
        System.out.println("Balance $" + balance);

    }

    @Override
    public void showCourses() {
        System.out.println(courses);

    }

    @Override
    public void payTution(int amount) {
        balance = balance - amount;
        //System.out.println("Payment: $" + amount);
    }

    @Override
    public String toString() {
        return "[Name: " + name + "]\n[Courses: " + courses + "]\n[Balance: " + balance + "]";
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

