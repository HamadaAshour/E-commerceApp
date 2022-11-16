package stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.P06_ChangeCurrency;
import org.testng.Assert;

import java.time.Duration;

import static stepDefs.Hooks.driver;

public class SD05_Currency {
    P06_ChangeCurrency currencyChange=new P06_ChangeCurrency();
    @And("user press on currency list.")
    public void user_press_on_currency_list() {
        currencyChange.currencyChangeList();
    }

    @And("user chooses Euro currency.")
    public void user_chooses_Euro_currency() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        currencyChange.euroCurrency().click();
    }

    @Then("item price changes to Euros.")
    public void item_price_changes_to_euros() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult = currencyChange.lenovoIdeaCentre600Price().getText();
        String expectedResult = "€";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #9 (Currency Change) | (Lenovo Idea Centre 600) Selecting EURO Currency Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);
    }

    @And("user chooses USD currency.")
    public void user_chooses_USD_currency() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        currencyChange.lenovoIdeaCentre600USDCurrencyChange().click();
    }


    @Then("item price changes to USD.")
    public void item_price_changes_to_USD() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult = currencyChange.lenovoIdeaCentre600Price().getText();
        String expectedResult = "$";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- Test Scenario NO9 (Currency Change) | (Lenovo Idea Centre 600) Selecting USD Currency Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);
    }
}
