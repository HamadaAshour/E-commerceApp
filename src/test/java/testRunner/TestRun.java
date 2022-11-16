package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src/main/resources/Features",
        glue = "stepDefs",
        tags = "@smoke",
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "testng:target/cukes.xml",
                "rerun:target/rerun.txt"},
        dryRun = false
)
public class TestRun extends AbstractTestNGCucumberTests {
}
