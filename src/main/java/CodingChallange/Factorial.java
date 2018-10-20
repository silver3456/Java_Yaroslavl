package CodingChallange;

public class Factorial {
    public static void main(String[] args) {

        int number = 5;

        for(int i = number -1; i>0; i--){
            number = number * i;
        }
        System.out.println(number);
    }
}
