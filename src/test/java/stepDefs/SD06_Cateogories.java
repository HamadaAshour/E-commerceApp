package stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.P01_HomePage;
import pages.P07_CateogoryPage;
import org.testng.Assert;
public class SD06_Cateogories {
    //we define instances of pages from which we will require
    P01_HomePage home = new P01_HomePage();
    P07_CateogoryPage categories = new P07_CateogoryPage();

    @And("user press on Computers from the homepage.")
    public void user_press_on_Computers_from_homepage() {
        home.computersCategory().click();
    }


    @And("user selects  Desktops option from Computers.")
    public void user_press_on_Desktops_option() {
        home.desktopsSubCategory().click();
    }

    @Then("webpage redirects the user to Desktops subcategory.")
    public void webpage_redirects_to_Desktops_subcategory() {
        String actualResult = Hooks.driver.getCurrentUrl();
        String expectedResult = categories.desktopsSubCategoryURL();
        Assert.assertTrue(actualResult.contains(expectedResult));//hard assertion
        System.out.println("\n--- Test Scenario NO10 (Categories) | Categories URL Redirect Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);
    }

    // confirms the second option is visible of the available desktop computers.
    @And("webpage shows a Desktop computer.")
    public void webpage_shows_a_Desktop_computer() {
        String actualResult = categories.digitalStormPCProductTitle().getText();
        String expectedResult = "Digital Storm VANQUISH 3 Custom Performance PC";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #9 (Categories) | Desktop Computer Shown Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);
    }
}
