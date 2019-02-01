package CodingChallange;

// *  * An Armstrong number of three digit is a number whose sum of cubes of its digits is equal to its number.
// For example 153 is an Armstrong number of 3 digit because 1^3+5^3+3^3 or   1+125+27=153

public class ArmstrongNumbers {
    public static boolean isArmstrong(int number) {
        int result = 0;
        int orig = number;
        while (number != 0) {

            //1 % 10 = 1
            //We need to find the highest number which is less than or equal to 1
            // and is the result of product of 10 and some number.
            // In this case highest number is 0. So the remainder is 1-0 = 1.
            int remainder = number % 10;
            result = result + remainder * remainder * remainder;
            number = number / 10;
        }
        //number is Armstrong return true
        if (orig == result) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(349));
    }
}
