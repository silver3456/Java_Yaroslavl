package CodingChallange;

//2 strings are called anagrams if they contain same set of characters but in different order
//Ex: Debit Card -> Bad Credit


public class AnagramsSolutionOne {
    public static void main(String[] args) {

        String first = "Debit Card";
        String second = "Bad Credit";

        System.out.println("Phrases \"" + first + " & " + second + "\"are "
                + (anagrams(first, second) ? "anagrams" : " not anagrams"));
    }

    private static boolean anagrams(String first, String second) {
        if (first.replaceAll("\\s", "").length()
                != second.replaceAll("\\s", "").length()) {
            return false;
        }
        int value = 0;
        for (int i = 0; i < first.replaceAll("\\s", "").length(); i++) {
            value = (int) (value + Math.pow(first.replaceAll("\\s", "").toLowerCase().charAt(i), 2));
            value = (int) (value - Math.pow(first.replaceAll("\\s", "").toLowerCase().charAt(i), 2));
        }
        return value == 0;
    }
}
