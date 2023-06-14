package stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BRHomePage;
import pages.BRLoginPage;
import utilities.WaitUtils;

import static utilities.ReusableMethods.verifyElementDisplayed;


public class BlueRentalStepDefs {


    BRHomePage brHomePage = new BRHomePage();
    BRLoginPage brLoginPage = new BRLoginPage();

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        brHomePage.homeLoginLink.click();

    }
    @When("user enters {string} and {string}\"")
    public void user_enters_and(String email, String password) {
        brLoginPage.userEmail.sendKeys(email);
        brLoginPage.userPassword.sendKeys(password);
        WaitUtils.waitFor(2);
    }

    @When("user clicks on login submit button")
    public void user_clicks_on_login_submit_button() {

        brLoginPage.loginSubmitButton.click();

    }
    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {

        //assertTrue(brHomePage.userID.isDisplayed());
        verifyElementDisplayed(brHomePage.homeLoginLink);

    }
    @Then("user logs out the application")
    public void user_logs_out_the_application() {


    }


}
