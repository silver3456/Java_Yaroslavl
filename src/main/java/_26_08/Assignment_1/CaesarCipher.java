package _26_08.Assignment_1;

public class CaesarCipher {
    public static void main(String[] args) {

        String encryption = encode("hello", 3);
        System.out.println(encryption);

        String decryption = decode("khoor", 3);
        System.out.println(decryption);

    }

    private static String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.:'";

    private static int alphaLength = alpha.length();
    private static String spaceCheck = " ";


    public static String encode(String plainText, int key) {
        String codedWord = "";


        // TODO Auto-generated method stub

        for (int i = 0; i < alpha.length(); i++) {
            //System.out.println(alpha.charAt(i));
        }
        System.out.println("\n\n");
        for (int i = 0; i <= plainText.length() - 1; i++) {
            spaceCheck = "" + plainText.charAt(i);
            if (spaceCheck.equals(" ")) {
                codedWord += spaceCheck;
            } else {
                int inx = alpha.indexOf(plainText.charAt(i));
                int shiftInx = (inx + key) % alpha.length();


                if (shiftInx >= alphaLength) {
                    shiftInx = shiftInx - alphaLength;
                }
                codedWord += alpha.charAt(shiftInx);

                //	codedWord += plainText.charAt(i);
            }
        }

        return codedWord;

    }

    public static String decode(String plainText, int key) {
        // TODO Auto-generated method stub
        String decodedWord = "";
        System.out.println("\n\n");
        for (int i = 0; i <= plainText.length() - 1; i++) {
            spaceCheck = "" + plainText.charAt(i);
            if (spaceCheck.equals(" ")) {
                decodedWord += spaceCheck;
            } else {
                int inx = alpha.indexOf(plainText.charAt(i));
                int shiftInx = (inx - key) % alpha.length();


                if (shiftInx >= alphaLength) {
                    shiftInx = shiftInx - alphaLength;
                }
                decodedWord += alpha.charAt(shiftInx);

                //	codedWord += plainText.charAt(i);
            }

        }
        return decodedWord;
    }
}
