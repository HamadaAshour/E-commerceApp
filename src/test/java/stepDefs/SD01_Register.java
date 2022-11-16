package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.P02_RegisterationPage;
public class SD01_Register {
    //define an instance of class P02_RegisterationPage
    SoftAssert a =new SoftAssert();//Apply soft assertion
    P02_RegisterationPage register=new P02_RegisterationPage();
    @And("user navigates to registration page.")
    public void user_navigates_to_registration_page() throws InterruptedException {
        Hooks.driver.navigate().to(register.registerPageURL());
        Thread.sleep(3000);
    }
    @And("user press on the male checkbox.")
    public void user_press_on_male_checkbox() {
        register.maleCheckBox().click();
    }
    @And("user enters a valid first name.")
    public void user_enters_valid_first_name() {
        register.firstNameTextField().sendKeys("Ahmed");
    }
    @And("user enters a valid last name.")
    public void user_enters_valid_last_name() {
        register.lastNameTextField().sendKeys("Magdy");
    }
    @And("user selects a valid date of birth.")
    public void user_select_valid_date_of_birth() {
        // Select Birth Day scroll panel & clicking on it.
        register.birthDayScrlPn().click();
        // Select 8 as the Birthday day.
        register.day8().click();
        // Selecting Birth Month.
        register.birthMonthScrlPn().click();
        // Selecting August as the Birthday Month.
        register.August().click();
        // Selecting Birth Year & click on it.
        register.birthYearScrlPn().click();
        // Selecting 2000 as the Birth Year.
        register.year2000().click();
    }
    @And ("user enters  valid email address.")
    public void user_enters_valid_email_address() {
        //set email address to ahmedmegz864@gmail.com
        register.emailAddressTextField().sendKeys(register.registerEmail());
    }
    @And ("user enters a valid password.")
    public void user_enters_valid_password() {
        //password will be Ahmed@2000
        register.passwordTextField().sendKeys(register.registerPassword());
    }
    @And ("user confirms  valid password.")
    public void user_reenter_valid_password() {
        register.confirmPassTextField().sendKeys(register.registerPassword());
    }
    @And ("user clicks on the register button.")
    public void user_clicks_on_register_button() {
        register.registerButton().click();
    }
    //Expected Result
    @Then("user could register successfully.")
    public void user_could_register_successfully() {
        String actualResult = register.registrationCompletedMsg().getText();
        String expectedResult = "Your registration completed";
        a.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- Test Scenario NO1 (Registration) | Text Displayed After User Registration Scenario NO1: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);
    }
    @And("user returned to register result webpage.")
    public void user_returned_to_register_result_webpage() {
        String actualResult = Hooks.driver.getCurrentUrl();
        String expectedResult = register.registerPageResultURL();
        a.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- Test Scenario NO1 (Registration) | Text Displayed After User Registration Scenario NO1: ---");
        System.out.println("** Actual Website Redirected to = " + actualResult);
        System.out.println("** Expected Website Redirected to = " + expectedResult);
    }
}
