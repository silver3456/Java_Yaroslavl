package _15_10_18.Assignment_3;

public class Solution {
    public static void main(String[] args) {

        getDeliciousDrink();
        getWine();
        getBubblyWine();
    }

    private static void getDeliciousDrink() {
        new BubblyWine().taste();
    }

    private static void getWine() {
        System.out.println(new BubblyWine().getHolidayName());
    }

    private static void getBubblyWine() {
        System.out.println(new Wine().getHolidayName());
    }
}

