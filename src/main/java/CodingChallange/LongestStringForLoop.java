package CodingChallange;

public class LongestStringForLoop {

    public static void main(String[] args) {

        String[] words = {"Alex", "Ben", "Mister"};

        int index = 0;
        int elementLength = words[0].length();

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > elementLength) {
                index = i;
                elementLength = words[i].length();
            }
        }
        System.out.println(words[index]);

    }

}

