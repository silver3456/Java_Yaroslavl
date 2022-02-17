package tesla;

/*
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

 */


import java.util.HashSet;
import java.util.Set;

public class FindSmallestNotInArray {

    public static void main(String[] args) {

//        int[]A = {1, 3, 6, 4, 1, 2};
//        int[]A = {1, 3, 6, 4, 1, 2};
        int[]A = {-1, - 3};
        System.out.println(solution(A));

    }

    public static int solution(int[] A) {
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return N;

    }

}
