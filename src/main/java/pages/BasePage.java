package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void waitForPageLoadComplete(long timeToWait) {
        new WebDriverWait(driver, Duration.ofSeconds(timeToWait)).until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
    }


    public void waitForAjaxToComplete(long timeToWait) {
        new WebDriverWait(driver, Duration.ofSeconds(timeToWait)).until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return jQuery.active == 0"));
    }

    public void waitVisibilityOfElement(long timeWait, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeWait));
        wait.until(ExpectedConditions.visibilityOf(element));

    }
}

