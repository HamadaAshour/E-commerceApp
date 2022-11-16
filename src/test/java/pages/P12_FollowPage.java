package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static stepDefs.Hooks.driver;
public class P12_FollowPage {
    public WebElement facebookIconPOM()
    {
        return driver.findElement(By.cssSelector("ul[class=\"networks\"] li[class=\"facebook\"]"));
    }
    public WebElement twitterIconPOM()
    {
        return driver.findElement(By.cssSelector("ul[class=\"networks\"] li[class=\"twitter\"]"));
    }
    public WebElement rssIconPOM()
    {
        return driver.findElement(By.cssSelector("ul[class=\"networks\"] li[class=\"rss\"]"));
    }
    public WebElement youtubeIconPOM()
    {
        return driver.findElement(By.cssSelector("ul[class=\"networks\"] li[class=\"youtube\"]"));
    }
}
