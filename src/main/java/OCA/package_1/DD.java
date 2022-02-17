package OCA.package_1;

public class DD extends CC {


    public DD(String name) {
        super(name);
    }

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");

        System.out.println(sb1 == sb2);
        System.out.println(sb1.toString().equals(sb2.toString()));
    }
}
