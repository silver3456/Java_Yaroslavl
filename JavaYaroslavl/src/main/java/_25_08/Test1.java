package _25_08;

public class Test1 {
    public static void main(String[] args) {
       /* LOOP:
        for (int i = 1; i <= 2; i++) {
            for (int b = 1; b <= 2; b++) {
                if (b == 1) {
                    System.out.println("inner loop: " + b);
                    break LOOP;
                }
            }

            System.out.println("outer loop: " + i);
        }
*/
        int i = 0;
        while(true){
            i++;

            if(i < 5)
                continue;
            else
                break;
        }
    }
}
