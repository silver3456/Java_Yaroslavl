package CodingChallange;

//A number is said to be binary, if it only contains 0 and 1.


public class BinaryOrNot {
    public static boolean isBinary(int number) {
        int var = number;

        while (var != 0) {
            if (var % 10 > 1) {
                return false;
            }
            var = var / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isBinary(10011101));
    }
}
