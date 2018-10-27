package _21_10_18.tests;

import _21_10_18.app.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    private static final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

    @BeforeSuite
    public void setUp() throws Exception {
        app.init();

    }

//    @AfterSuite
//    public void tearDown() {
//        app.stop();
//    }
}
