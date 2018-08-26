import _25_08.JUtils;
import org.junit.Assert;
import org.junit.Test;

public class FactorTest {
    @Test
    public void testFactor(){
        System.out.println("hi");
        int result = JUtils.findFactorial(3);
        Assert.assertTrue("result = " + result, result == 6);

    }
    @Test
    public void testSin(){
        double result = JUtils.findSin(90);
        Assert.assertTrue("result = " + result, result ==1);
    }
}
