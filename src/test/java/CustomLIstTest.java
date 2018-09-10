import _09_09_18.Assignment_1.CustomList;
import _09_09_18.Assignment_1.CustomListImpl;
import org.junit.Assert;
import org.junit.Test;

public class CustomLIstTest {

    @Test
    public void testList() {
        CustomList list = new CustomListImpl();
        list.add(1);
        list.get(2);
        System.out.println(list.get(0));
        Assert.assertEquals(1, list.size());

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.set(1, 55);
        Assert.assertEquals(55, list.get(1));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
        Assert.assertEquals(11, list.size());
    }
}
