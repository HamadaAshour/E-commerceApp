package stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P14_Slider;
import org.testng.Assert;
import static stepDefs.Hooks.driver;
public class SD14_Slider {
    P14_Slider slider=new P14_Slider();
    @And("go to home page.")
    public void user_navigates_to_registration_page() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
    }
    @When("click on first slider")

    public void click_on_first_slider() throws InterruptedException
    {
        slider.firstSliderSquarePOM().click();
        slider.firstSliderPOM().click();
        Thread.sleep(4000);
    }
    @When("click on second slider")

    public void click_on_second_slider() throws InterruptedException
    {
        slider.secondSliderSquarePOM().click();
        slider.secondSliderPOM().click();
        Thread.sleep(4000);
    }
    @Then("relative product for first slider is displayed")

    public void first_product_details_opened()
    {
        String expectedResult= "https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualResult= driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Then("relative product for second slider is displayed")

    public void second_product_details_opened()
    {
        String expectedResult= "https://demo.nopcommerce.com/iphone-6";
        String actualResult= driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
