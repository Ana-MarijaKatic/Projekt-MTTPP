import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ItemTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(testName = "Search For The Item Test")
    public static void searchItemTest() throws Exception {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        Thread.sleep(500);
        webForm.pressSearchInput();
        Thread.sleep(500);
        webForm.enterItem();
        Thread.sleep(500);
        webForm.pressSearchButton();
        Thread.sleep(500);
    }
    @AfterClass
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
