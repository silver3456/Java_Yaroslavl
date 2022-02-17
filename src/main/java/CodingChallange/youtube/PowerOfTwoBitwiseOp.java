package CodingChallange.youtube;

//https://www.youtube.com/watch?v=bjRNBh0olIM

/*
If this is a power of two, there will be only 1 bit
when we do num & (num -1) it should be equal 0
for ex: 4 & 3 == 0

To find if a given number is power of 2 is by doing and (&) operation
between the given number and number -1 should be equal 0

 */

public class PowerOfTwoBitwiseOp {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
    }

    private static boolean isPowerOfTwo(int num) {
        if (num < 0) return false;

        return (num != 0) && ((num & (num - 1)) == 0);
    }
}
