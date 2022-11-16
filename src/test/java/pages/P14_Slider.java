package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static stepDefs.Hooks.driver;
public class P14_Slider {
    public WebElement firstSliderPOM()
    {
        return   driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]"));
    }
    public WebElement secondSliderPOM()
    {
        return   driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]"));
    }


    public WebElement firstSliderSquarePOM()
    {
        return driver.findElement(By.cssSelector("a[rel=\"0\"]"));
    }
    public WebElement secondSliderSquarePOM()
    {
        return driver.findElement(By.cssSelector("a[rel=\"1\"]"));
    }
}
