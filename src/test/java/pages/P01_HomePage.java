package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static stepDefs.Hooks.driver;
//in this class I wii define attributes and methods needed for the home page and to navigate through it
public class P01_HomePage {
    public String homepageURL() {
        return "https://demo.nopcommerce.com/";//the link is provided in Project Preparation document
    }
    //here we define TextField element
    public WebElement searchTextField() {
        By searchTextField = By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]");//get element using css selector
        return driver.findElement(searchTextField);
    }
    // here we Define Search Button Element.
    public WebElement searchButton() {
        By searchButton = By.cssSelector("button[class=\"button-1 search-box-button\"]");
        return driver.findElement(searchButton);
    }
    // Here we Define Computers Category in TOP MENU:
    public WebElement computersCategory() {
        By computersCategory = By.cssSelector("ul[class=\"top-menu notmobile\"] > li > [href=\"/computers\"]");
        return driver.findElement(computersCategory);
    }

    // Here we Define Desktops SubCategory in TOP MENU:
    public WebElement desktopsSubCategory() {
        By desktopsSubCategory = By.cssSelector("ul[class=\"sublist\"] > li[class=\"inactive\"] > [href=\"/desktops\"]");
        return driver.findElement(desktopsSubCategory);
    }

    // Here we Define Apparel Category in TOP MENU:
    public WebElement apparelCategory() {
        By apparelCategory = By.cssSelector("ul[class=\"top-menu notmobile\"] > li > a[href=\"/apparel\"]");
        return driver.findElement(apparelCategory);
    }
}
