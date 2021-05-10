package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPosition extends Page {
    @FindBy(xpath = "//*[@for='positionCity']/../span")
    private WebElement cityText;

    public String city(){
        return cityText.getText();
    }
}
