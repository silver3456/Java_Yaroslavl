package OCA.oca_answers;

//https://vceguide.com/what-is-the-result-483/


public class Item {
    int a1;

    public static void doProduct(int a) {
        a = a * a;
    }

    public static void doString(StringBuilder s) {
        s.append(" " + s);
    }

    public static void main(String[] args) {
        Item testItem = new Item();
        testItem.a1 = 11;
        StringBuilder sb = new StringBuilder("Hello");
        Integer i = 10;
        doProduct(i);
        doString(sb);
        doProduct(testItem.a1);
        System.out.println(i + " " + sb + " " + testItem.a1);

    }
}
