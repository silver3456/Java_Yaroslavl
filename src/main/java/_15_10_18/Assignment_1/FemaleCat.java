package _15_10_18.Assignment_1;

public class FemaleCat extends Cat {
    public FemaleCat() {
        super();
    }

    @Override
    void printCat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "FemaleCat";
    }
}
