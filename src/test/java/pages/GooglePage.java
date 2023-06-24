package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public GooglePage(){

    }
    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(xpath = "//button[.='Alle akzeptieren']")
    public WebElement popUpAccept;
    //(//div[@class='QS5gu sy4vM'])[2]
}