package OCA;

public class Frodo extends Hobbit{

    public static void main(String[] args) {

        Frodo f = new Frodo();

        Hobbit h = new Frodo();
        int myGold = 7;
        System.out.println();

        System.out.println(f.countGold(myGold, 6));
    }

}
