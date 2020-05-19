package bddtests.pageObjects;
import bddtests.selectors.LoginSelectors;
import bddtests.utils.Wait;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class LoginPage {

    LoginSelectors loginSelectors = new LoginSelectors();
    String errMsg;

    public void loginFailEntry(String userName, String password) {
        Wait.wait.until(visibilityOfElementLocated(By.cssSelector(loginSelectors.username))).sendKeys(userName);
        Wait.wait.until(visibilityOfElementLocated(By.cssSelector(loginSelectors.password))).sendKeys(password);
        Wait.wait.until(visibilityOfElementLocated(By.cssSelector(loginSelectors.loginButton))).click();
    }

    public void validateFailedLogin() {
        errMsg = Wait.wait.until(visibilityOfElementLocated(By.cssSelector(loginSelectors.loginErrMsg))).getText();
        assertEquals("login FAILED!", errMsg);
    }
}