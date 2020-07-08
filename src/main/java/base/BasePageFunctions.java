package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePageFunctions extends BasePage {

    public BasePageFunctions(WebDriver driver) {
        super(driver);
    }

    public WebDriver getDriver() {
        return pageDriver;
    }

    public void navigate(String url) {
        pageDriver.navigate().to(url);
    }

    public WebElement find(By by){
        return pageDriver.findElement(by);
    }

    public List<WebElement> finds(By by){
        return pageDriver.findElements(by);
    }

    public void sendKeys(By by,String text) {
        pageDriver.findElement(by).sendKeys(text);
    }

    public void click(By by) {
        pageDriver.findElement(by).click();
    }

    public void wait(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected Boolean waitElement(By by, int second) {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), second);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected WebElement waitVisibility(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected void waitForLoad() {
        new WebDriverWait(pageDriver, 30).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }


    protected WebElement waitClickable(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}
