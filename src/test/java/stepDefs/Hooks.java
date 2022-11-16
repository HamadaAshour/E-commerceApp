package stepDefs;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    //define an instance of webdriver
    public static WebDriver driver ;
    @BeforeAll
    /*
        description: the following function open the browser and maximize its window
     */
    public static void user_opens_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /*
     description: Sleep for 3 secs & Quits Chrome Browser.
     */
    @AfterAll
    public static void chrome_browser_quits() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
