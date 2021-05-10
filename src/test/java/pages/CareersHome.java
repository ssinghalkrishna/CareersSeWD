package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static support.TestContext.getDriver;

public class CareersHome extends Page {

    public CareersHome() {
        url = "https://skryabin-careers.herokuapp.com/";}

    @FindBy(xpath="//*[@id='positionsQuickSearchInput']")
    private WebElement searchInput;

    @FindBy(xpath="//*[@id='positionsQuickSearchButton']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[contains(@href,'positions')]")
    private WebElement positionTitle;

    public void searchPosition(String title) throws InterruptedException {
        searchInput.sendKeys(title);
        searchButton.click();

        new WebDriverWait(getDriver(), 5).until(
                ExpectedConditions.textToBePresentInElement(
                        positionTitle, title));
        positionTitle.click();
    }
}
