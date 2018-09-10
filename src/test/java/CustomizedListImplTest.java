import _09_09_18.Assignment_1.CustomList;
import _09_09_18.Assignment_2.CustomizedListImpl;
import org.junit.Assert;
import org.junit.Test;

public class CustomizedListImplTest {

    @Test
    public void testList() {

        CustomList<String> list = new CustomizedListImpl(10);
        list.add("Alex");
        list.add("Bob");
        Assert.assertEquals(2, list.size());
        //System.out.println(list.get(0));

        for (int i = 0; i < 10; i++){
            list.add("Andrew");
           // System.out.print(list.get(i) + " ");
        }
        Assert.assertEquals(12, list.size());

        list.set(1, "John");
        Assert.assertEquals("John", list.get(1));
    }

}
