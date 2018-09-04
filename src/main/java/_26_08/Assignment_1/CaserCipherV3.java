package _26_08.Assignment_1;

//Resolved by myself

public class CaserCipherV3 {

    public static void main(String[] args) {

        String encoded = encode("help", 3);
        System.out.println(encoded);

        String decoded = decode("khos", 3);
        System.out.println(decoded);
    }

    public static String encode(String enc, int key) {

        StringBuilder stringBuilder = new StringBuilder();
        char shifted = 0;
        for (char i : enc.toCharArray()) {
            int askii = (int) i + key;
            shifted = (char) askii;
            String var = String.valueOf(shifted);
            StringBuilder encoded = stringBuilder.append(var);

        }
        return stringBuilder.toString();
    }

    public static String decode(String enc, int offset) {
        return encode(enc, 0 - offset);
    }
}



