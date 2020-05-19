package bddtests.stepDefs;

import bddtests.utils.Hooks;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import static bddtests.utils.BrowserDriver.*;
import static bddtests.utils.TestConstants.*;
import static org.junit.Assert.assertEquals;


public class Frontend_test_stepdefs {

    @Given("^the Google homepage is open$")
    public void theGooglehomepageisopen() throws Throwable {
        loadPage("http://www.google.com");
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String searchString) throws Throwable {

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(searchString);
        element.submit();

        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("halifax");
            }
        });

        System.out.println("Page title is: " + driver.getTitle());
    }

    @And("^I select \"([^\"]*)\" in Googles results$")
    public void iSelectInGooglesResults(String resultSelect) throws Throwable {
        driver.findElement(By.xpath(FIRST_GOOGLE_RESULT)).click();
    }

    @Then("^the Halifax home page wil be shown$")
    public void theHalifaxHomePageWilBeShown() throws Throwable {
        Thread.sleep(100);
        assertEquals("Halifax UK | Bank Accounts, Savings, Loans & Mortgages", driver.getTitle());
    }

}
