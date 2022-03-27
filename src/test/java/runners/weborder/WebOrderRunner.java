package runners.weborder;

//THESE ARE INTERVIEW QUESTIONS
// Runner class is way to run all your feature files from here
// to be able to run your code you need to have:
// @RunWith annotations comes from junit and it executes the feature file steps
//CucumberOptions: is a special annotations that has some key words
//feature: this is the location of feature files ( this one should be content root)
//glue: this is the location of step definitions (this one should be source root and delete. java part to amke it more genral
//dryRun: this is a way to get snips without executing the whole implementations.
//it means if you make it true, you will get immediately unimplemented snips

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.weborder", //this is path for feature files
        glue = "stepdefinitions/webordersteps", //this is path for step definitions
        dryRun = false, // should be false unless you want to get snippets
        tags = "@smokeLoginTest" //@smoke and @regression and @ahmet and not @tc1

)

public class WebOrderRunner {

}
