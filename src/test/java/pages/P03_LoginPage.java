package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static stepDefs.Hooks.driver;
public class P03_LoginPage {
    public String loginPageURL() {
        return "https://demo.nopcommerce.com/login?returnUrl=%2F";//got it while debugging login Screen
    }
    //get Email textfield web element
    public WebElement loginEmailTextField() {
        By loginEmailTextField = By.cssSelector("input[class=\"email\"]");
        return driver.findElement(loginEmailTextField);
    }
    //to use it in invalid email and password Scenario
    public String invalidLoginEmail() {
        return "Testrandomcheck765@udacity.com";
    }
    public WebElement passwordEmailTextField() {
        By passwordEmailTextField = By.cssSelector("input[class=\"password\"]");
        return driver.findElement(passwordEmailTextField);
    }
    public String invalidLoginPassword() {
        return "InvalidCheck777";
    }
    public WebElement loginButton() {
        By loginButton = By.cssSelector("button[class=\"button-1 login-button\"]");
        return driver.findElement(loginButton);
    }
    //get the textfield in case of successful login
    public WebElement loginSuccessTextField() {
        By loginSuccessTxtFld = By.cssSelector("a[class=\"ico-logout\"]");
        return driver.findElement(loginSuccessTxtFld);
    }
    public WebElement loginUnSuccessTextField() {
        By loginUnSuccessTextField = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");
        return driver.findElement(loginUnSuccessTextField);
    }
// now we have all web elements to write SD02_login :)

}
