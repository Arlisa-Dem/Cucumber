package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        ADDING CONFIGURATIONS

        monochrome = false,
        features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
        glue = "stepdefinitions",//PATH OF STEPDEFINITIONS FOLDER
        dryRun = false,
        tags = "@google_search"
)
public class GridRunner {

}


