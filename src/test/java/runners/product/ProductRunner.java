package runners.product;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.products", //content root
        glue="stepdefinitions/productsteps", //step definitions/source root.
        dryRun = false,
        tags = "@productProjectOutline",   //  @productProjectOutline @productproject
        plugin = {"pretty","html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}

)

public class ProductRunner {


}
