package CodingChallange;

public class OddNumbers {
    public static void main(String[] args) {
        int max = 10;

        System.out.println("Odd numbers are");

        for (int i = 0; i <= max; i++)
            if (i % 2 != 0)
                System.out.println(i);
    }
}
