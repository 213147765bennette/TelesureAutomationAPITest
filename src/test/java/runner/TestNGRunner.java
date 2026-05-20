package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by {Bennette Molepo} on {2026/05/20}.
 * Email address {bennettemolepo@gmail.com}
 */
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps"},
        plugin = {"html:target/cucumberTestReport.html"},
        tags = "@smoke"
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
