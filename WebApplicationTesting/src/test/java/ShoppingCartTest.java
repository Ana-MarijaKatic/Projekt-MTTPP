import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ShoppingCartTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(testName = "Add The Item In The Shopping Cart Test 1")
    public static void addItemInShoppingCart1() throws Exception {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        Thread.sleep(500);
        webForm.pressAddToCart();
        Thread.sleep(1000); //This Thread.sleep is needed because we wait for a notification
        webForm.pressCartTotal();
        Thread.sleep(500);
        webForm.pressViewCart();
    }
    @Test(testName = "Add The Item In The Shopping Cart Test 2")
    public static void addItemInShoppingCart2() throws Exception {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        Thread.sleep(500);
        webForm.pressMacBook();
        Thread.sleep(500);
        webForm.pressButtonCart();
        Thread.sleep(500);
        webForm.pressShoppingCart();
    }
    @AfterClass
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
