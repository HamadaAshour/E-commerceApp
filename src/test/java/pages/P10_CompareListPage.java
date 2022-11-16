package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static stepDefs.Hooks.driver;
public class P10_CompareListPage {
    // Compare Products webpage URL.
    public String compareProductsURL() {
        return "https://demo.nopcommerce.com/compareproducts";
    }

    // Digital Storm Vanquish 3 product text label
    public WebElement digitalStormVanquish3_textLabel() {
        By digitalStormVanquish3_textLabel = By.cssSelector("tr.product-name > td:nth-child(2) > a");
        return driver.findElement(digitalStormVanquish3_textLabel);
    }

    // Lenovo Idea Centre 600 product text label.
    public WebElement lenovoIdeaCentre600_textLabel() {
        By lenovoIdeaCentre600_textLabel = By.cssSelector("tr.product-name > td:nth-child(3) > a");
        return driver.findElement(lenovoIdeaCentre600_textLabel);
    }
}
