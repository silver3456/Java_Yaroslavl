package OCA.oca_answers;

public class FieldInit {
    char c;
    boolean b;
    float f;

    void  print() {
        System.out.println("c = " + c);
    }

    public static void main(String[] args) {
        FieldInit f = new FieldInit();
        f.print();
    }
}
