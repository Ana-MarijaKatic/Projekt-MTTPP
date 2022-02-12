import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(testName = "Login Test")
    public static void loginUserTest() throws Exception{
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);

        //Thread.sleep method is not required, but is used to display the sequential execution of commands
        Thread.sleep(2000);
        webForm.pressMyAccount();
        Thread.sleep(500);
        webForm.pressLogin();
        Thread.sleep(500);
        webForm.enterEmail();
        Thread.sleep(500);
        webForm.enterPassword();
        Thread.sleep(500);
        webForm.pressLoginButton();
        Thread.sleep(500);
        webForm.pressMyAccount();
        Thread.sleep(500);
        webForm.pressLogout();
        Thread.sleep(500);
    }

    @AfterClass
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}