package _21_10_18;

import _21_10_2018.LoginPage;
import _26_08.Assignment_1.CaeserCipherV3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VKTest {

    private WebDriver driver;
    private LoginPage lp;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        lp = new LoginPage(driver);

    }

    @Test
    public void testLogin() {
        lp.login(CaeserCipherV3.decode("pfisbo+_bpq=j^fi+or", -3),
                CaeserCipherV3.decode("pfisbo./1/", -3));
        String title_actual = driver.getTitle();
        Assert.assertEquals("Welcome! | VK", title_actual);
        System.out.println(title_actual);
        driver.close();
    }

    public void testUnreadMessages(){
        

    }
}

