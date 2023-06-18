package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
//        ADDING CONFIGURATIONS
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },

        //monochrome = false,
                features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
        glue = {"stepdefinitions","hooks"},//PATH OF STEPDEFINITIONS FOLDER
        dryRun = false,//GENERATES ONLY MISSING STEPS DEFS WHEN dryRun = true
        tags = "@scenario_outline_1"
)
public class Runner {
}


