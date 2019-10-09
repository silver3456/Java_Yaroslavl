package CodingChallange;

public class LongestStringForLoop {

    public static void main(String[] args) {

        String[] words = {"Alex", "Ben", "Mister", "GreatBritain"};

        int index = 0;
        int maxLength = words[0].length();

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                index = i;
            }
        }
        System.out.println("Longest word is " + words[index]);

    }

}

