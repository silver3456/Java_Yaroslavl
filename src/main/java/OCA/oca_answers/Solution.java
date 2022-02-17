package OCA.oca_answers;

public class Solution {
    int x, y;

    public Solution(int x, int y) {
      initialize(x, y);
    }

    public void initialize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {
        int x = 9, y = 5;
        Solution obj = new Solution(x, y);
        System.out.println(x + " " + y);
    }
}
