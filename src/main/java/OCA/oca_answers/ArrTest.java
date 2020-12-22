package OCA.oca_answers;

//https://vceguide.com/what-is-the-result-452/

public class ArrTest {
    public static void main(String[] args) {
        int numbers [];
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;

        numbers = new int[4];
        numbers[2] = 30;
        numbers[3] = 40;


        for (int x : numbers)
            System.out.print(" " + x);
    }
}
