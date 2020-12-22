package CodingChallange.youtube;


public class PowerOfTwo {

    public static void main(String[] args) {

        System.out.println(powerOfTwo(32));

    }

    static boolean powerOfTwo(int n) {
        return (n > 0 && ((n & (n - 1)) == 0));
    }
}
