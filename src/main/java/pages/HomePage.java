package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends pages.BasePage {
    @FindBy(xpath = "//ul[@id='gh-topl']")
    private WebElement header;

    @FindBy(xpath = "//footer[@id='glbfooter']")
    private WebElement footer;

    @FindBy(xpath = "//ul[@id='gh-topl']")
    private WebElement logInButton;

    @FindBy(xpath = "//a[@title='My eBay']")
    private WebElement myEbayButton;

    @FindBy(xpath = "//li[@id='gh-minicart-hover']")
    private WebElement cartIcon;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public boolean isHeaderVisible() {
         return header.isDisplayed();
    }

    public boolean isFooterVisible() {
        return footer.isDisplayed();
    }

    public boolean isMyEbayButtonVisible() {
        return myEbayButton.isDisplayed();
    }

    public boolean isCartIconVisible() {
        return cartIcon.isDisplayed();
    }

    public boolean isLogInButtonVisible() {
        return logInButton.isDisplayed();
    }

    public WebElement getLogInButton() {
        return logInButton;
    }

    public void clickLogInButton() {
        logInButton.click();
    }
}
