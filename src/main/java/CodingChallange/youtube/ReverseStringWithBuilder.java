package CodingChallange.youtube;

/*
If I use String + String + ... + n
In this case I will create new String instances every time, so it
will result in a lot of object being collected by Java GC
 */

/*
https://www.youtube.com/watch?v=gy1uve2BwG8&t=320s
 */



public class ReverseStringWithBuilder {

    public static void main(String[] args) {

        System.out.println(reverseWithStringBuilder("Alex"));

    }

    private static String reverseWithStringBuilder(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
