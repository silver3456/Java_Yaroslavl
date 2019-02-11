package CodingChallange;

public class ReverseStatement {
    public static void main(String[] args) {

        String name = "John Smith";
        String[] arr = name.split(" ");
        String reverse = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse = reverse.concat(arr[i]);
            System.out.print(reverse);
            reverse = " ";
        }
    }
}

