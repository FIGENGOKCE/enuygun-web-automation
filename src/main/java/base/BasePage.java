package base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver pageDriver;
    WebDriverWait wait;
    protected final Logger log = Logger.getLogger(getClass());

    public BasePage(WebDriver driver) {
        pageDriver = driver;
        wait = new WebDriverWait(driver, 40);
        pageDriver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
    }
}
