package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    //Hooks: This class is used to run methods Before abd After each scenario
    //Notes: We need to declare hooks package inside Runner class at the glue step-- glue = {"stepdefinitions","hooks"},

    @Before// This annotation must be imported from --> io.cucumber.java.Before
    public void setUp() {
        //This method will work before each scenario
        System.out.println("This is @Before method from Hooks class");
    }

    @After
    public void tearDown(Scenario scenario) {
//        AFTER EACH SCENARIO
//        System.out.println("AFTER METHOD");
        if (scenario.isFailed()) {//attach the report only if a scenario fails
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
            Driver.closeDriver();
        }
    }
}