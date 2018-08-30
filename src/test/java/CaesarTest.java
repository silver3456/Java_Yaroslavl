import _26_08.Assignment_1.CaesarCipherSimple;
import org.junit.Assert;
import org.junit.Test;

public class CaesarTest {
    @Test
    public void testEncode() { //method encryption
        String result = CaesarCipherSimple.encode("hello", 3);
        Assert.assertEquals(result, "khoor");
    }

    @Test
    public void testDecode() {//method decryption
        String result = CaesarCipherSimple.decode("khoor", 3);
        Assert.assertEquals(result, "hello");
    }
}
