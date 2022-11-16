package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static stepDefs.Hooks.driver;
public class P04_ResetPassword {
    public String resetPasswordURL() {
        return "https://demo.nopcommerce.com/passwordrecovery";
    }

    public WebElement recoverPasswordButton() {
        By recoverPasswordButton = By.cssSelector("button[class=\"button-1 password-recovery-button\"]");
        return driver.findElement(recoverPasswordButton);
    }

    public WebElement resetPasswordSuccessText() {
        By resetPasswordSuccessText = By.cssSelector("p[class=\"content\"]");
        return driver.findElement(resetPasswordSuccessText);
    }

    public WebElement emailNotFoundBarNotif() {
        By emailNotFoundBarNotif = By.cssSelector("div[class=\"bar-notification error\"] > p[class=\"content\"]");
        return driver.findElement(emailNotFoundBarNotif);
    }
}
