package pages;

import org.openqa.selenium.support.PageFactory;

import static support.TestContext.getDriver;

public class Page {
    protected String url;

    public Page() {
        PageFactory.initElements(getDriver(), this);
    }
    public void open() {
            getDriver().get(url);
        }
}
