package _26_08.Assignment_1;

public class CaesarCipherSimple {
    public static void main(String[] args) {

        String str = "Let's go places";

        System.out.println("Encrypted message is: " + CaesarCipherSimple.encode(str, 3));

        System.out.println("Decrypted message is: " + CaesarCipherSimple.decode(CaesarCipherSimple.encode(str, 3), 3));
    }

    public static String decode(String enc, int offset) {
        return encode(enc, 26 - offset);
    }

    public static String encode(String enc, int key) {
        key = key % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + key) % 26));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + key) % 26));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
}
