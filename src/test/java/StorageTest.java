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

    public void testAddFruits() {

        Map<Storage, Set<Fruits>> fruitStore = new HashMap<>();

        Set<Fruits> fruitsSet = new HashSet<>();

        Fruits[] fruitBasket = new Fruits[]{(new Fruits("Яблоки", 30, 500)),
                new Fruits("Апельсины", 50, 700), new Fruits("Ананасы", 70, 300)};

        StorageUtils.addFruits(fruitBasket, fruitsSet);

        fruitStore.put(new Storage("Брагино", new Fruits()), fruitsSet);


        // StorageUtils.printFruits();
    }
}
