package CodingChallange;

public class StringConvertInt {
    public static void main(String[] args) {

        String input = "one,five,zero,nine,eight,three";
        String[] word = input.split(",");

        int digit;

        for (String number : word) {

            switch (number) {
                case "zero":
                    digit = 0;
                    System.out.print(digit);
                    break;
                case "one":
                    digit = 1;
                    System.out.print(digit);
                    break;
                case "two":
                    digit = 2;
                    System.out.print(digit);
                    break;
                case "three":
                    digit = 3;
                    System.out.print(digit);
                    break;
                case "four":
                    digit = 4;
                    System.out.print(digit);
                    break;
                case "five":
                    digit = 5;
                    System.out.print(digit);
                    break;
                case "six":
                    digit = 6;
                    System.out.print(digit);
                    break;
                case "seven":
                    digit = 7;
                    System.out.print(digit);
                    break;
                case "eight":
                    digit = 8;
                    System.out.print(digit);
                    break;
                case "nine":
                    digit = 9;
                    System.out.print(digit);
                    break;
            }
        }
    }
}
