package _02_09.Assignment_2;


public class Task6 {
    public static void main(String[] args) {

        Integer[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        int max = arr[0][0];
        int index = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int temp = arr[i][j];

                if (max < temp) {
                    max = temp;
                    index = i;
                }
            }
        }

        System.out.println("i=" + index);
    }
}




