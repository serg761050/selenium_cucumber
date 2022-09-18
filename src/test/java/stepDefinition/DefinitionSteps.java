package stepDefinition;

import io.cucumber.java.en.Then;
import pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;


public class DefinitionSteps {
    WebDriver driver;
    HomePage homePage;
    PageFactoryManager pageFactoryManager;

    private static final long DEFAULT_TIMEOUT = 60;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @After
    public void tearDown() {
        driver.close();
    }



    @Given("User opens {string} site")
    public void user_opens_site(String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User checks header visibility")
    public void user_checks_header_visibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.isHeaderVisible();
    }

    @And("User checks cart icon visibility")
    public void user_checks_cart_icon_visibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.isCartIconVisible();

    }

    @Then("User checks login button visibility")
    public void user_checks_login_button_visibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.isLogInButtonVisible();

    }

    @And("User click login button")
    public void userClickLoginButton() {
        homePage.waitVisibilityOfElement(10, homePage.getLogInButton());
        homePage.clickLogInButton();
    }
}
