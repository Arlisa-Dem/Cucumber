package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.GooglePage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

public class CommonStepDefs {

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {
        Driver.getDriver().get(string);

    }

    @Then("verify the page title contains {string}")
    public void verify_the_page_title_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @And("capture the screenshot")
    public void captureTheScreenshot() throws IOException {
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
}