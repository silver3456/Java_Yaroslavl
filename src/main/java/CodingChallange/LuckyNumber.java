//Lucky number - sum of first 3 equals to the sum of last 3 digits

public class LuckyNumber {

    public static void main(String[] args) {
        int num = 123222;

        System.out.println(isLucky(num));

    }

    private static boolean isLucky(int number) {
        String numToString = Integer.toString(number);
        int half = numToString.length() / 2;
        String firstNum = numToString.substring(0, half);
        String secondNum = numToString.substring(half);

        int sum1 = 0;
        int sum2 = 0;

        for (int i =0 ; i < half; i++) {
            sum1 += Integer.parseInt(firstNum.substring(i, i + 1));
            sum2 += Integer.parseInt(secondNum.substring(i, i + 1));
        }

        return sum1 == sum2;
    }
}
