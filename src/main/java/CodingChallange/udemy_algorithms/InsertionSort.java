package CodingChallange.udemy_algorithms;
/*
- In place algorithm (doesn't need extra space)
- O(n*2) - quadratic
- Stable algorithm
- Very efficient with SMALL data sets
- Approach: we assume that the first sorted element starts at index 0 that's why unsorted starts
at index 1.
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -25, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
