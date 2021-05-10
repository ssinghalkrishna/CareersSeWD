package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestContext {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void initialize() {
        String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
        //user.dir - local path to ur project. never add actual path. if import to another m/c, may fail.

        System.setProperty("webdriver.chrome.driver", chromeDriverPath); //its a hashmap

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies(); //we r using only here to keep it simple, so not using get
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void teardown() {
        driver.quit();
    }
}
