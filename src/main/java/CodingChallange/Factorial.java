package CodingChallange;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(5));

    }

    private static int fac(int number) {
        for(int i = number -1; i>0; i--){
            number = number * i;
        }
        return number;

    }

}
