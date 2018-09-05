package _26_08.Assignment_2;

//resolved by myself

public class SumInArray {
    public static void main(String[] args) {

        int[] arr = {1, 3, 7, 45, 50, 5, 30};

        int indexMin = findMin(arr);

        int indexMax = findMax(arr);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[indexMin] && arr[i] < arr[indexMax]) {
                if (i > indexMin && i < indexMax)
                    sum = sum + arr[i];
            }
        }
        System.out.print("Sum between min and max values of array = " + sum);
    }

    private static int findMax(int[] array) {
        int max = array[0];
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    private static int findMin(int[] array) {

        int min = array[0];
        int indexMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }
}


