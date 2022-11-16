package stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P05_SearchPage;
public class SD04_Search {
    //defining new instances of pages with webElements required
    P01_HomePage home=new P01_HomePage();
    P05_SearchPage search =new P05_SearchPage();
    SoftAssert a=new SoftAssert();//using Soft assertion
    //Test Scenario 7
    @And("user uses the search text field and enters lenovo.")
    public void user_users_the_search_text_field_and_enters_lenovo() {
        home.searchTextField().sendKeys("Lenovo");
    }

    @Then("user clicks on the search button.")
    public void user_clicks_on_the_search_button() {
        home.searchButton().click();
    }


    @And("user is redirected to a search webpage with the text entered in our case lenovo.")
    public void user_redirected_to_a_search_webpage_with_the_textEntered() {
        String actualURL = Hooks.driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/search?q=Lenovo";
        a.assertTrue(actualURL.contains(expectedURL));
        System.out.println("\n--- Test Scenario NO7 (Search) | Keyword Searching URL Comparison: ---");
        System.out.println("** Actual URL = " + actualURL);
        System.out.println("** Expected URL = " + expectedURL);
        String actualDisplayedOption = search.lenovoIdeaCentre600Ele().getText();
        String expectedDisplayedOption = "Lenovo";
        a.assertTrue(actualDisplayedOption.contains(expectedDisplayedOption));
        System.out.println("\n--- Test Scenario NO7) | Displayed Option Comparison: ---");
        System.out.println("** Actual Displayed Option = " + actualDisplayedOption);
        System.out.println("** Expected Displayed Option = " + expectedDisplayedOption);
    }
}
