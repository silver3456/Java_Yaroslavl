package OCA;

public class Coffee {

    private CoffeeSize size;


    public static void main(String[] args) {

      Coffee drink = new Coffee();
      drink.size = CoffeeSize.HUGE;

        System.out.println(drink.size.getOunces());

        for (CoffeeSize cs : CoffeeSize.values()) {
            System.out.println(cs + " " + cs.getOunces());
        }

        Coffee drink2 = new Coffee();
        drink2.size = CoffeeSize.OVERWHELMING;

        System.out.println(drink2.size.getLidCode());


    }


}




