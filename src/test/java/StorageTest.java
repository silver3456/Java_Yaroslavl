import _22_09_18.Assignment_3.Assignment_1.Fruits;
import _22_09_18.Assignment_3.Assignment_1.Storage;
import _22_09_18.Assignment_3.Assignment_1.StorageUtils;
import org.junit.Test;

import java.util.*;

public class StorageTest {

    @Test

    public void testAddFruits() throws Exception {
        System.out.println("first method");
        Map<Storage, Set<Fruits>> fruitStore = new HashMap<>();
        Set<Fruits> fruitsSetOne = new HashSet<>();
        Set<Fruits> fruitsSetTwo = new HashSet<>();

        Fruits[] fruitBasketOne = new Fruits[]{(new Fruits("Яблоки", 30, 500)),
                new Fruits("Апельсины", 50, 700), new Fruits("Ананасы", 70, 300)};

        Fruits[] fruitBasketTwo = new Fruits[]{(new Fruits("Яблоки", 40, 500)),
                new Fruits("Апельсины", 40, 700), new Fruits("Ананасы", 80, 300)};

        StorageUtils.addFruits(fruitBasketOne, fruitsSetOne);
        StorageUtils.addFruits(fruitBasketTwo, fruitsSetTwo);


        fruitStore.put(new Storage("Брагино", fruitsSetOne), fruitsSetOne);
        fruitStore.put(new Storage("Центр", fruitsSetTwo), fruitsSetTwo);

        System.out.println("Fruits found: " + fruitStore.get(new Storage("Брагино", null)));

        StorageUtils.printFruits("Storage one", fruitStore);

    }

    @Test

    public void testPrice() {
        System.out.println("second method");
        List<Storage> storages = new ArrayList();
        Set<Fruits> fruitsSetOne = new HashSet<>();
        Set<Fruits> fruitsSetTwo = new HashSet<>();

        Fruits[] fruitBasketOne = new Fruits[]{(new Fruits("Яблоки", 10, 500)),
                new Fruits("Апельсины", 10, 700), new Fruits("Ананасы", 10, 300)};

        Fruits[] fruitBasketTwo = new Fruits[]{(new Fruits("Яблоки", 40, 500)),
                new Fruits("Апельсины", 40, 700), new Fruits("Ананасы", 80, 300)};

        StorageUtils.addFruits(fruitBasketOne, fruitsSetOne);
        StorageUtils.addFruits(fruitBasketTwo, fruitsSetTwo);

        Storage storageOne = new Storage("Брагино", fruitsSetOne);
        Storage storageTwo = new Storage("Центр", fruitsSetTwo);

        storages.add(storageOne);
        storages.add(storageTwo);

        System.out.println("Storage with min average price is " + StorageUtils.priceCompare(storages));

    }
}

