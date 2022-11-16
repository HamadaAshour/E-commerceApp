package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static stepDefs.Hooks.driver;
public class P05_SearchPage {
    // Defines Lenovo Idea Centre 600 Laptop Element because it is my laptop also we could use macbook pro said in the pdf.
    public WebElement lenovoIdeaCentre600Ele() {
        By lenovoIdeaCentre600 = By.cssSelector("h2[class=\"product-title\"] > a[href=\"/lenovo-ideacentre-600-all-in-one-pc\"]");
        return driver.findElement(lenovoIdeaCentre600);
    }
}
