package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    public BaseTest() {}

    @BeforeMethod
    public void setUp() throws MalformedURLException {

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() { driver.quit(); }
}
