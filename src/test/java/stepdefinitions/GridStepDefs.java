package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.WaitUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class GridStepDefs {

     WebDriver driver;


    @Given("user is on the application with chrome")
    public void user_is_on_the_application_with_chrome() throws MalformedURLException {
       driver =  new RemoteWebDriver(new URL("http://192.168.178.48:4444"),new ChromeOptions());
       //Rest is Selenium
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://bluerentalcars.com");
       }

    @Then("verify the title is {string}")
    public void verify_the_title_is(String title) {
        String actualTitle = driver.getTitle();
        assertEquals(title,actualTitle);
       }

    @Then("close the remote driver")
    public void close_the_remote_driver() {
        WaitUtils.waitFor(3);
        driver.quit();
      }
    @Given("user is on the application with firefox")
    public void userIsOnTheApplicationWithFirefox() throws MalformedURLException {

        driver = new RemoteWebDriver(new URL("http://localhost:4444"), new FirefoxOptions());
        //Rest is selenium (same)
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bluerentalcars.com/");

    }

    @Given("user is on the application with edge")
    public void userIsOnTheApplicationWithEdge() throws MalformedURLException {

        driver = new RemoteWebDriver(new URL("http://localhost:4444"), new EdgeOptions());
        //Rest is selenium (same)
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bluerentalcars.com/");

    }
}
