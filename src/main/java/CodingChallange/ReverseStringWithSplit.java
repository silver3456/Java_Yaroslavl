package CodingChallange;

//Write a program which will print a String in reverse

public class ReverseStringWithSplit {
    public static void main(String[] args) {

        String word = "Alex";
        String[] letter = word.split("");

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(letter[i]);
        }
    }
}
