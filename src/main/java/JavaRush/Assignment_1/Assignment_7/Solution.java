package JavaRush.Assignment_1.Assignment_7;

public class Solution {
    public static void main(String[] args) {

        Cow cowOne = new Cow("Zoya", 10, 100, 1000);
        Cow cowTwo = new Cow("Marusya", 12, 90, 1200);

        boolean result = cowOne.fight(cowTwo);
        System.out.println(result);

    }
}
