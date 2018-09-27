import _22_09_18.Assignment_3.Assignment_1.Fruits;
import _22_09_18.Assignment_3.Assignment_1.Storage;
import _22_09_18.Assignment_3.Assignment_1.StorageUtils;
import org.junit.Test;

import java.util.*;

public class StorageTest {

    @Test

    public void testAddFruits() {

        Map<Storage, Set<Fruits>> fruitStoreOne = new HashMap<>();
        Map<Storage, Set<Fruits>> fruitStoreTwo = new HashMap<>();

        Set<Fruits> fruitsSetOne = new HashSet<>();
        Set<Fruits> fruitsSetTwo = new HashSet<>();

        Fruits[] fruitBasketOne = new Fruits[]{(new Fruits("Яблоки", 30, 500)),
                new Fruits("Апельсины", 50, 700), new Fruits("Ананасы", 70, 300)};

        Fruits[] fruitBasketTwo = new Fruits[]{(new Fruits("Яблоки", 40, 500)),
                new Fruits("Апельсины", 40, 700), new Fruits("Ананасы", 80, 300)};

        StorageUtils.addFruits(fruitBasketOne, fruitsSetOne);
        StorageUtils.addFruits(fruitBasketTwo, fruitsSetTwo);

        Storage storageOne = new Storage("Брагино");//Как получить Value если key будет new Storage()?
        Storage storageTwo = new Storage("Центр");

        fruitStoreOne.put(storageOne, fruitsSetOne);
        fruitStoreTwo.put(storageTwo, fruitsSetTwo);

        System.out.println(fruitStoreOne.get(storageOne));
        System.out.println(fruitStoreOne.get(storageTwo));


//        StorageUtils.printFruits("Storage one: ", fruitStoreOne);
//        StorageUtils.printFruits("Storage two: ", fruitStoreTwo);
    }

    @Test

    public void testPrice() {
        Map<Storage, Set<Fruits>> fruitStoreOne = new HashMap<>();
        Map<Storage, Set<Fruits>> fruitStoreTwo = new HashMap<>();

        Set<Fruits> fruitsSetOne = new HashSet<>();
        Set<Fruits> fruitsSetTwo = new HashSet<>();

        Fruits[] fruitBasketOne = new Fruits[]{(new Fruits("Яблоки", 30, 500)),
                new Fruits("Апельсины", 50, 700), new Fruits("Ананасы", 70, 300)};

        Fruits[] fruitBasketTwo = new Fruits[]{(new Fruits("Яблоки", 40, 500)),
                new Fruits("Апельсины", 40, 700), new Fruits("Ананасы", 80, 300)};

        StorageUtils.addFruits(fruitBasketOne, fruitsSetOne);
        StorageUtils.addFruits(fruitBasketTwo, fruitsSetTwo);

        Storage storageOne = new Storage("Брагино");//Как получить Value если key будет new Storage()?
        Storage storageTwo = new Storage("Центр");

        fruitStoreOne.put(storageOne, fruitsSetOne);
        fruitStoreTwo.put(storageTwo, fruitsSetTwo);

        int avgPriceOne = fruitsSetOne.stream().mapToInt(Fruits::getPrice).sum();
        int avgPriceTwo = fruitsSetTwo.stream().mapToInt(Fruits::getPrice).sum();

        int targetPrice;
        Storage storageCheapest;

        if (avgPriceOne > avgPriceTwo) {
            targetPrice = avgPriceTwo;
            storageCheapest = storageTwo;
        } else {
            targetPrice = avgPriceOne;
            storageCheapest = storageOne;
        }

        System.out.println("The cheapest storage is " + storageCheapest.toString() +
                " with total price sum " + targetPrice);

    }
}

