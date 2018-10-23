package _21_10_18;

import _21_10_2018_VK.ApplicationManager;
import _21_10_2018_VK.LoginPage;
import _26_08.Assignment_1.CaeserCipherV3;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class VKTest {

    @Test
    public void testLogin() {
        WebDriver driver = ApplicationManager.driver;
        LoginPage lp = new LoginPage(driver);
        lp.login(CaeserCipherV3.decode("pfisbo+_bpq=j^fi+or", -3),
                CaeserCipherV3.decode("Pfisbo=.5./", -3));
        String title_actual = driver.getTitle();
        Assert.assertEquals("Welcome! | VK", title_actual);
        System.out.println(title_actual);
    }

    @Test
    public void testUnreadMessages() {
        String message = ApplicationManager.driver.findElement(By.xpath("//*[@id=\"l_msg\"]/a/span/span[1]/span")).getText();
        System.out.println(message);
    }
}

