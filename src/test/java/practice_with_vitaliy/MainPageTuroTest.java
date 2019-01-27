package practice_with_vitaliy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MainPageTuroTest {

    private WebDriver driver;

    private MainPageTuro page;


//    @Test
//    public void findCityToDrive() {
//        page.enterPartOfCity("Berke");
//        page.chooseCity("Berkeley, CA, USA");
//    }

    @Test
    public void findCityToDrive() {
        page.enterPartOfCity("Los Ang");
        page.chooseCity("Los Angeles, CA, USA");
    }

    @BeforeClass
    public void setUpClass() {
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();

    }

    @BeforeMethod
    public void init() {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://turo.com/");
        page = new MainPageTuro(driver);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
