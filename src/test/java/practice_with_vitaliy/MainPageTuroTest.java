package practice_with_vitaliy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainPageTuroTest {

    private WebDriver driver;

    private MainPageTuro page;

    @Test

    public void enterPartOfCityTest() {
        driver.get("https://turo.com/");
        page.enterPartOfCity("San");
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        page = new MainPageTuro(driver);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}