package runner;


import org.testng.annotations.Listeners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import testnglisteners.ITestListeners;



@CucumberOptions(
        features = {"D:/Java eclipse workspace/CommunityPoll/src/test/java/feature/com_poll.feature",
                    },
        glue = {"steps" },
        dryRun = false,
        plugin = {
            "pretty",
            "html:targettestng/cucumberreport_poll.html",
            "json:targettestng/cucumber.json",
            "junit:targettestng/xmlReport.xml",
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\", \"timeline:test-output-thread/"
            
          
        },
        monochrome=true
)

@Listeners(ITestListeners.class)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
