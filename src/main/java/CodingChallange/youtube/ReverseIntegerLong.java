package CodingChallange.youtube;

/*
use long  because when i reverse input it might be < || > max and min
Integer.MAX_VALUE OR INTEGER.MIN_VALUE
 */

/*
https://www.youtube.com/watch?v=-ToGzpENG5k
https://www.youtube.com/watch?v=j3VMLDg7Tp4
 */

public class ReverseIntegerLong {

    public static void main(String[] args) {
        System.out.println(reverseInteger(-129));
    }

    private static int reverseInteger(int input) {

        boolean negative = false;
        if (input < 0) {
            negative = true;
        }

        long reversed = 0;
        while (input != 0) {
            reversed = reversed * 10 + input % 10;
            input /= 10;

            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE )
                return 0; // ask interviewer what to return
        }
        return (int)reversed;
    }


}












