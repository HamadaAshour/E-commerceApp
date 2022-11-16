package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static stepDefs.Hooks.driver;
public class P02_RegisterationPage {
    //to navigate to the register page
    public String registerPageURL() {
        return "https://demo.nopcommerce.com/register?returnUrl=%2F";
    }

    public String registerPageResultURL() {
        return "https://demo.nopcommerce.com/registerresult/1?returnUrl=/";
    }
    //to get male checkbox element
    public WebElement maleCheckBox() {
        By maleCheckBox = By.id("gender-male");
        return driver.findElement(maleCheckBox);
    }
    public WebElement firstNameTextField() {
        By firstNameTextField = By.id("FirstName");
        return driver.findElement(firstNameTextField);
    }

    public WebElement lastNameTextField() {
        By lastNameTextField = By.id("LastName");
        return driver.findElement(lastNameTextField);
    }

    public WebElement birthDayScrlPn() {
        By birthDayScrlPn = By.name("DateOfBirthDay");
        return driver.findElement(birthDayScrlPn);
    }
//my birthday :)
    public WebElement day8() {
        By day8 = By.cssSelector("select[name=\"DateOfBirthDay\"] > option[value=\"8\"]");
        return driver.findElement(day8);
    }

    public WebElement birthMonthScrlPn() {
        By birthMonthScrlPn = By.name("DateOfBirthMonth");
        return driver.findElement(birthMonthScrlPn);
    }

    public WebElement August() {
        By month7 = By.cssSelector("select[name=\"DateOfBirthMonth\"] > option[value=\"8\"]");
        return driver.findElement(month7);
    }

    public WebElement birthYearScrlPn() {
        By birthYearScrlPn = By.name("DateOfBirthYear");
        return driver.findElement(birthYearScrlPn);
    }

    public WebElement year2000() {
        By year2000 = By.cssSelector("option[value=\"2000\"]");
        return driver.findElement(year2000);
    }

    public WebElement emailAddressTextField() {
        By emailAddressTextField = By.cssSelector("div[class=\"inputs\"] > input[type=\"email\"]");
        return driver.findElement(emailAddressTextField);
    }

    public String registerEmail() {
        return "ahmedmegz864@gmail.com";
    }

    public WebElement passwordTextField() {
        By passwordTextField = By.id("Password");
        return driver.findElement(passwordTextField);
    }

    public String registerPassword() {
        return "Ahmed@2000";
    }

    public WebElement confirmPassTextField() {
        By confirmPassTextField = By.id("ConfirmPassword");
        return driver.findElement(confirmPassTextField);
    }

    public WebElement registerButton() {
        By registerButton = By.cssSelector("button[name=\"register-button\"]");
        return driver.findElement(registerButton);
    }

    public WebElement registrationCompletedMsg() {
        By registrationCompletedMsg = By.cssSelector("div[class=\"result\"]");
        return driver.findElement(registrationCompletedMsg);
    }

    public WebElement passwordErrorMsg() {
        By passwordErrorMsg = By.id("Password-error");
        return driver.findElement(passwordErrorMsg);
    }

}
