package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
//        ADDING CONFIGURATIONS
        features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
        glue = "stepdefinitions",//PATH OF STEPDEFINITIONS FOLDER
        dryRun = false,//GENERATES ONLY MISSING STEPS DEFS WHEN dryRun = true
        tags = "@customer_login"
)
public class Runner {
}


