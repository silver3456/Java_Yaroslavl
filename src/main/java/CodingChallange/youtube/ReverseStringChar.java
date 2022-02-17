package CodingChallange.youtube;

//https://www.youtube.com/watch?v=2bIxz2pTFaw


public class ReverseStringChar {


    public static void main(String[] args) {
        char[] arr = {'a', 'l', 'e', 'x'};

        System.out.println(reverseString(arr));

    }

    public static String reverseString(char[] characters) {

        int left = 0;
        int right = characters.length -1;

        while (left < right) {
            char temp = characters[left];
            characters[left++] = characters[right];
            characters[right--] = temp;
        }
        return new String(characters);

    }


}
