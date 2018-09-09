package _26_08.Assignment_1;

//Resolved by myself

public class CaserCipherV3 {

    public static void main(String[] args) {

        String encoded = encode("help", -3);
        System.out.println(encoded);

        String decoded = decode("ebim", -3);
        System.out.println(decoded);
    }

    public static String encode(String enc, int key) {

        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : enc.toCharArray()) {
            int code = (int)ch;
            int askii = code + key;

            if(code >= 255 - key)
                askii = askii - 255;

            char shifted = (char) askii;
            String var = String.valueOf(shifted);
            stringBuilder.append(var);

        }
        return stringBuilder.toString();
    }

    public static String decode(String enc, int offset) {
        return encode(enc, 0 - offset);
    }
}



