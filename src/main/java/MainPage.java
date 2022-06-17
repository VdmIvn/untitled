import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    private By buttonSignIn = By.xpath("//input[@value='Войти в Одноклассники']");
    private By buttonSignUp = By.xpath("//form/div[4]/div[2]/a[text()='Зарегистрироваться']");

    private By loginField = By.xpath("//*[@id='field_email']");
    private By passwordField = By.xpath("//*[@id='field_password']");

    public void clickSignIn() {
    driver.findElement(buttonSignUp).click();
    }

    public SignUpPage clickSignUp() {
        driver.findElement(buttonSignUp).click();
        return new SignUpPage(driver);
    }

    public MainPage typePhone(String phone) {
        driver.findElement(loginField).sendKeys(phone);
        return this;
    }

    public MainPage typeEmail(String email) {
        driver.findElement(loginField).sendKeys(email);
        return this;
    }

    public MainPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }


}

