package CodingChallange;

//Find length of String not using length()

public class LengthString {
    public static void main(String[] args) {

        String word = "alex";
        String[] arr = word.split("");

        int length = 0;

        for(int i =0; i < arr.length; i++){
            length++;
        }
        System.out.println("Length of word is " + length);
    }
}
