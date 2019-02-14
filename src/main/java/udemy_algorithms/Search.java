package udemy_algorithms;

public class Search {
    public static int linearSearch(int[] dataSet, int target) {
        for (int i = 0; i < dataSet.length; i++) {
            if (dataSet[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] dataSet, int target, int start, int end) {
        //binary search assumes a sorted array and can therefore continually split out search domain in half
        int midPoint = (int) Math.floor(((start+end)/2));
        System.out.println("mid " + midPoint);
        int value = dataSet[midPoint];

        if (target > value) {
            System.out.println(target + " > " + value) ;
            return binarySearch(dataSet, target, midPoint, end); //Base case

        } else if (target < value) {
            System.out.println(target + " < " + value) ;
            return binarySearch(dataSet, target, start, midPoint);//Base case

        }
        System.out.println(target + " = " + value) ;
        return midPoint;

    }
}
