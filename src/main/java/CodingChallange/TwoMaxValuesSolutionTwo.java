package CodingChallange;

public class TwoMaxValuesSolutionTwo {
    public static void main(String[] args) {

        int[] arr = {3, 8, 4, 7, 9, 1, 5};

        int maxOne = 0;
        int maxTwo = 0;

        for(int n : arr){
            if(maxOne < n){
                maxTwo = maxOne;
                maxOne = n;
            }
            else if(maxTwo < n){
                maxTwo = n;
            }
        }

        System.out.println("Max two values are " + maxOne + " and " + maxTwo );
    }
}