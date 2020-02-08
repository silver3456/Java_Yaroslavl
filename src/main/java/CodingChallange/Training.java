package CodingChallange;

public class Training {

    public static void main(String[] args) {

        String[] words = {"Alexddd", "Bob", "Vasya", "Andrei", "Anna"};

        String longest = "";

        for (int i = 0; i < words.length; i++) {
           if (words[i].length() > longest.length()) {
               longest = words[i];
           }
        }
        System.out.println(longest);

    }

}

