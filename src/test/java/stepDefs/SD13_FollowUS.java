package stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P12_FollowPage;
import static stepDefs.Hooks.driver;
import org.testng.Assert;

import java.util.ArrayList;

public class SD13_FollowUS {
    P12_FollowPage follow=new P12_FollowPage();

    @When("user click on facebook icon")

    public void user_open_facebook_link()
    {
        follow.facebookIconPOM().click();
    }

    @When("user click on twitter icon")

    public void user_open_twitter_link()
    {
        follow.twitterIconPOM().click();
    }

    @When("user click on rss icon")

    public void user_open_rss_link()
    {
        follow.rssIconPOM().click();
    }

    @When("user click on youtube icon")

    public void user_open_youtube_link()
    {
        follow.youtubeIconPOM().click();
    }

    @Then("^\"([^\"]*)\" is opened in new tab$")

    public void user_open_new_tab(String url) throws InterruptedException
    {
        Thread.sleep(4000);
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
        String expectedResult = url;
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);
        driver.close();
        driver.switchTo().window(Tabs.get(0));
    }
    @Then("^\"([^\"]*)\" is opened in new rss tab$")

    public void user_open_new_rss_tab(String url) throws InterruptedException
    {
        Thread.sleep(4000);
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(0));
        String expectedResult = url;
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);
    }
}

