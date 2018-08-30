import _26_08.Assignment_3.CountSymb2;
import org.junit.Assert;
import org.junit.Test;

public class CountSymbTest {

    @Test
    public void testCount() {
        String str = "fhhfajlkja";
        int result = CountSymb2.countSymbols(str, 'a');
        Assert.assertEquals(result, 2);

    }
}
