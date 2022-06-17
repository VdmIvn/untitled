import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass {

    static WebDriver driver;


    public static void main(String[] args) {


        WebDriverManager.chromedriver().browserVersion("102.0.5005.63").setup();

        MainPage mainPage = new MainPage(driver);

        driver.get("https://ok.ru");

        mainPage.typeEmail("ivt@mail.ru");


    }
}
