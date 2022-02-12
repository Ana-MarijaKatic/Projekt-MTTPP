import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AccountTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test (testName = "Update Account Test")
    public static void updateAccountTest() throws Exception{
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        loginUser(webForm);
        Thread.sleep(500);
        webForm.pressEditAccount();
        Thread.sleep(500);
        webForm.enterNewTelephone();
        Thread.sleep(500);
        webForm.pressContinue();
        Thread.sleep(500);
    }
    public static void loginUser(WebForm webForm){
        webForm.pressMyAccount();
        webForm.pressLogin();
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
