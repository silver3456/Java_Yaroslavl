package udemy_algorithms;

public class Demo {
    public static void main(String[] args) {

        int[] numbers = {4, 77, 34, 8, 99, 342};
        int[] sortedNumbers = {2, 7, 9, 12, 45, 65, 67, 89, 90, 112, 145, 179};

        //Call a linear function that searches for a specific number
        int position = udemy_algorithms.Search.linearSearch(numbers, 99);
        //System.out.println("Found in position: " + position);

        //Call the binary search
        int index = udemy_algorithms.Search.binarySearch(sortedNumbers, 2,0, sortedNumbers.length );
        System.out.println("Found in position: " + index);
    }
}