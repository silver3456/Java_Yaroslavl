package coding_vitaly_alexschool;

public class AmazonQuestion {

    static int[] multiple(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int res = 1;
        for (int i : array) {
            res = res * i;
        }
        for(int i=0; i< array.length; i++){
            int temp = array[i];
            array[i] = res/temp;
        }
        return array;
    }
}
