package stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P02_RegisterationPage;
import pages.P03_LoginPage;
import pages.P04_ResetPassword;

import java.time.Duration;

import static stepDefs.Hooks.driver;
public class SD03_ResetPassword {
    //defining new instances of pages with webElements required
    P02_RegisterationPage register = new P02_RegisterationPage();
    P03_LoginPage login = new P03_LoginPage();
    P04_ResetPassword resetPassword = new P04_ResetPassword();
    SoftAssert a = new SoftAssert();

    @And("user navigates to forget password webpage.")
    public void user_navigates_to_forget_password_webpage() {
        driver.navigate().to(resetPassword.resetPasswordURL());
    }
    //Test Scenario 5
    @When("user enters a valid email address.")
    public void user_enters_a_valid_email_address() {
        login.loginEmailTextField().sendKeys(register.registerEmail());
    }

    @And("user press on the recover button.")
    public void user_press_on_recover_button() {
        resetPassword.recoverPasswordButton().click();
    }
    @Then("user could reset the password successfully.")
    public void user_could_reset_password_successfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = resetPassword.resetPasswordSuccessText().getText();
        String expectedResult = "Email with instructions has been sent to you.";
        a.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- Test Scenario NO5 | Reset Password Valid Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);
    }
    //Test Scenario 6
    @When("user enters an invalid email address.")
    public void user_enters_an_invalid_email_address() {
        login.loginEmailTextField().sendKeys(login.invalidLoginEmail());
    }
    @Then("user should not be able to reset password.")
    public void user_should_not_be_able_to_reset_password() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = resetPassword.emailNotFoundBarNotif().getText();
        String expectedResult = "Email not found.";
        a.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- Test Scenario NO6 | Reset Password Valid Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);

    }
}

