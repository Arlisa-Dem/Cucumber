package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MedunnaPage;
import utilities.WaitUtils;

public class MeddunaStepDefs {

    MedunnaPage medunnaPage = new MedunnaPage();

    @Given("user clicks on icon")
    public void user_clicks_on_icon() {
        medunnaPage.userIcon.click();
    }

    @And("user click on sign in link")
    public void userClickOnSignInLink() {
        medunnaPage.signInLink.click();
    }

    @When("user enters username {string} and {string}")
    public void user_enters_username_and(String username, String password) {
        WaitUtils.waitFor(1);
        medunnaPage.username.sendKeys(username);
        WaitUtils.waitFor(1);
        medunnaPage.password.sendKeys(password);

    }


    @And("user click on sign in submit button")
    public void userClickOnSignInSubmitButton() {
        medunnaPage.submitButton.click();
    }
}
