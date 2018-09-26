import _22_09_18.Assignment_3.Assignment_1.Fruits;
import _22_09_18.Assignment_3.Assignment_1.Storage;
import _22_09_18.Assignment_3.Assignment_1.StorageUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StorageTest {

    @Test

    public void testAddFruits() throws Exception {

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

        fruitStoreOne.put(new Storage("Брагино"), fruitsSetOne);
        StorageUtils.printFruits("Storage one: ", fruitStoreOne);
        fruitStoreTwo.put(new Storage("Центр"), fruitsSetTwo);
        StorageUtils.printFruits("Storage two: ", fruitStoreTwo);

    }
}
