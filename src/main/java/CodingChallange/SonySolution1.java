package CodingChallange;

public class SonySolution1 {

    public static void main(String[] args) {
        solution(24);
    }

    //Codility -> 2
    // Test -> 3
    // Coders -> 5
    //CodilityTestCoders -> 2, 3, 5

    public static void solution(int N) {
        // write your code in Java SE 8

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else {
                System.out.println(i);
            }
        }
    }
}
