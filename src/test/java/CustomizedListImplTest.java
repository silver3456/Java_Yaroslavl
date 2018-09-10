import _09_09_18.Assignment_1.CustomList;
import _09_09_18.Assignment_2.CustomizedListImpl;
import org.junit.Test;

public class CustomizedListImplTest {

    @Test
    public void testList() {

        CustomList<Double> list = new CustomizedListImpl(10);
        list.add(2.0);

        for (int i = 0; i < 10; i++) {
            list.add(1.0);
            System.out.print(list.get(i) + " ");

        }
    }
}