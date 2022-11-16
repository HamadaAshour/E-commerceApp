package stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P02_RegisterationPage;
import pages.P03_LoginPage;

import java.time.Duration;

import static stepDefs.Hooks.driver;
public class SD02_Login {
    // Defining pages containing Webelements methods needed :)
    P01_HomePage home = new P01_HomePage();
    P02_RegisterationPage register = new P02_RegisterationPage();
    P03_LoginPage login = new P03_LoginPage();
    SoftAssert a=new SoftAssert();//we are using soft assertion is said in the Project Scenarios pdf
    @And("navigates to login page.")
    public void navigates_to_login_page() throws InterruptedException {
        driver.navigate().to(login.loginPageURL());
        Thread.sleep(3000);
    }
    //Test Scenario 3
    @When("user enters a valid login email.")
    public void user_enters_valid_login_email() {
        login.loginEmailTextField().sendKeys(register.registerEmail());

    }
    @And("user enters a valid login password.")
    public void user_enters_valid_login_password() {
        login.passwordEmailTextField().sendKeys(register.registerPassword());
    }
    @And("user press on the login button.")
    public void user_press_on_login_button() {
        login.loginButton().click();
    }
    @Then("user logged in successfully.")
    public void user_could_login_successfully() {
        String actualResult = login.loginSuccessTextField().getText();
        String expectedResult = "Log out";
        a.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- Test Scenario NO3 (Login) | Text Displayed Logout button NO3: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);
    }
    @And("returned to the home page of the website.")
    public void returned_to_home_page_of_the_website() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = driver.getCurrentUrl();
        String expectedResult = home.homepageURL();
        System.out.println("\n--- Test Scenario NO3 (Login) | Redirected to home page Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);

    }
    //Test Scenario NO 4
    @When("user enters invalid login email.")
    public void user_enters_invalid_login_email() {
        login.loginEmailTextField().sendKeys(login.invalidLoginEmail());
    }
    @And("user enters invalid login password.")
    public void user_enters_invalid_login_password() {
        login.passwordEmailTextField().sendKeys(login.invalidLoginPassword());
    }
    @Then("user could not login successfully.")
    public void user_could_not_login_successfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = login.loginUnSuccessTextField().getText();
        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        a.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TC #4 (Login) | User failed to login Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);

    }


}
