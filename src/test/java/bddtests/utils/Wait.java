package bdd.tests.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import static bdd.tests.support.Driver.driver;

public class Wait extends Driver {

    public static WebDriverWait wait = new WebDriverWait(driver, 40);

}

