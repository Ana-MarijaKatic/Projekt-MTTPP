import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String EMAIL = "katic@gmail.com";
    private final String PASSWORD = "testTest";
    private final String TELEPHONE = "+385988664321";
    private final String BRAND = "samsung";


    @FindBy(id = "input-email")
    private WebElement email;

    @FindBy(id = "input-password")
    private WebElement password;

    @FindBy(id = "telephone")
    private WebElement telephone;

    @FindBy(id = "input-telephone")
    private WebElement newTelephone;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]")
    private WebElement myAccount;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    private WebElement login;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
    private WebElement logout;

    @FindBy(xpath = "//*[@id=\"content\"]/ul[1]/li[1]/a" )
    private WebElement editAccount;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]")
    private WebElement macBook;

    @FindBy(xpath = "//*[@id=\"cart\"]/button")
    private WebElement cartTotal;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]")
    private WebElement viewCart;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")
    private WebElement imageMacBook;

    @FindBy(id = "button-cart")
    private WebElement buttonCart;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[4]/a/span")
    private  WebElement shoppingCart;

    @FindBy(linkText = "Tablets")
    private WebElement tablets;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[2]")
    private WebElement tab;

    @FindBy(id = "wishlist-total")
    private WebElement wishList;

    @FindBy(xpath = "//*[@id=\"search\"]/input")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@id=\"search\"]/span/button")
    private WebElement searchButton;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(){
        this.email.sendKeys(EMAIL);
    }
    public void enterPassword(){
        this.password.sendKeys(PASSWORD);
    }
    public void enterNewTelephone() {
        this.newTelephone.clear();
        this.newTelephone.sendKeys(TELEPHONE);
    }
    public void pressMyAccount(){ this.myAccount.click();}
    public void pressLogin(){ this.login.click();}
    public void pressLoginButton(){ this.loginButton.click();}
    public void pressLogout() { this.logout.click();}
    public void pressEditAccount() { this.editAccount.click();}
    public void pressContinue() { this.continueButton.click();}
    public void pressAddToCart() {this.macBook.click();}
    public void pressCartTotal() { this.cartTotal.click();}
    public void pressViewCart() { this.viewCart.click();}
    public void pressMacBook() { this.imageMacBook.click();}
    public void pressButtonCart() { this.buttonCart.click();}
    public void pressShoppingCart() { this.shoppingCart.click();}
    public void pressTablets() { this.tablets.click();}
    public void pressAddToList() { this.tab.click();}
    public void pressWishList() { this.wishList.click();}
    public void pressSearchInput() {this.searchInput.sendKeys();}
    public void enterItem() {this.searchInput.sendKeys(BRAND);}
    public void pressSearchButton() {this.searchButton.click();}
}
