package stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.P01_HomePage;
import pages.P07_CateogoryPage;
import org.testng.Assert;
import java.time.Duration;
import static stepDefs.Hooks.driver;
public class SD07_Filter {
    //we define instances of pages from which we will require
    P01_HomePage home = new P01_HomePage();
    P07_CateogoryPage categories = new P07_CateogoryPage();
    @And ("user presses on Apparel from homepage.")
    public void user_press_on_Apparel_from_homepage() {
        home.apparelCategory().click();
    }

    @And("user presses  on Shoes subcategory.")
    public void user_press_on_shoes_subcategory() {
        categories.shoesSubCategory().click();
    }

    @And("user selects the red checkbox.")
    public void user_press_on_red_checkbox() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        categories.shoesRedCheckBox().click();
    }

    @Then("user gets Shoes options with red colour.")
    public void userGetsShoesOptionsWithRedColour() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = categories.adidasConsortiumCampus80sProduct().getText();

        // A shoes having red colour as an option:
        String expectedResult = "adidas Consortium Campus 80s Running Shoes";//name of Shoes with red color
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- Test Scenario NO11 (Filter With Colour) | Shoes with red colour as an option Comparison: ---");
        System.out.println("** Actual Shoes Name Result = " + actualResult);
        System.out.println("** Expected Shoes Name Result = " + expectedResult);
    }
}
