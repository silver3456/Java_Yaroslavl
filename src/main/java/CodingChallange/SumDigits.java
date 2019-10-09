package CodingChallange;

public class SumDigits {


    // 10 % 3 = 1
    // 1 % 10 = 1

    public static void main(String[] args) {
        int num = 534;
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
