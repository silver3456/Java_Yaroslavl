package _21_10_18;

import _21_10_2018_VK.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeSuite
    public void setUp() throws Exception {
        app.init();

    }

    @AfterSuite(enabled = false)
    public void tearDown() {
        //app.stop();
    }
}
