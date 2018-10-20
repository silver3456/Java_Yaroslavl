package CodingChallange;

public class ReverseStringBuffer {
    public static void main(String[] args) {

        int number = 12345;
        int original = number;

        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));
        stringBuffer.reverse();
        int reverse = Integer.parseInt(stringBuffer.toString());
        System.out.println(original + " : " + reverse);

    }
}