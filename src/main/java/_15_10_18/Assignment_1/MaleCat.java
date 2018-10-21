package _15_10_18.Assignment_1;

public class MaleCat extends Cat {
    MaleCat() {
        super();
    }

    @Override
    void printCat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "MaleCat";
    }
}
