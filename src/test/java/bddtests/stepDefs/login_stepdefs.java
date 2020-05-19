package bddtests.stepDefs;

import bddtests.selectors.LoginSelectors;
import bddtests.utils.Wait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static bddtests.utils.BrowserDriver.*;
import static bddtests.utils.TestConstants.*;
import static org.junit.Assert.assertEquals;
import bddtests.pageObjects.LoginPage;


public class login_stepdefs {

    LoginPage loginPage = new LoginPage();

    @Given("^the facebook login page is open$")
    public void loginPage() throws Throwable {
        loadPage(FB_LOGIN);
    }

    @When("^I enter my \"([^\"]*)\" and \"([^\"]*)\"$")
    public void loginEnter(String username, String password) throws Throwable {
        loginPage.loginFailEntry(username, password);
        }

    @Then("^an error message will be shown$")
    public void loginFail() throws Throwable {
        loginPage.validateFailedLogin();
    }

}
