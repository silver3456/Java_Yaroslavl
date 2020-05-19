package OCA;

public class MyException {
    public static void main(String[] args) {
        String[] food = {"chicken", "mushrooms", "shit"};

        try {
            for (String dish : food) {
                checkFood(dish);
            }

        } catch (BadFoodException e) {
            e.printStackTrace();
            System.out.println(e.findBadFood());
        }

    }

    private static void checkFood(String meal) throws BadFoodException {
        if (meal.equals("shit")) {
            System.out.println(meal);
            throw new BadFoodException();
        } else {
            System.out.println("Food is delicious - " + meal);
        }
    }
}
