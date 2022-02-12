import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WishListTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(testName = "Add An Item To The Wish List Test")
    public static void addItemToWishList() throws Exception {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        Thread.sleep(500);
        webForm.pressTablets();
        Thread.sleep(500);
        webForm.pressAddToList();
        Thread.sleep(500);
        webForm.pressWishList();
        Thread.sleep(500);
        loginUser(webForm);
        Thread.sleep(500);
    }
    public static void loginUser(WebForm webForm) {
        webForm.enterEmail();
        webForm.enterPassword();
        webForm.pressLoginButton();
    }
    @AfterClass
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
