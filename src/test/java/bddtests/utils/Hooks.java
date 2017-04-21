package bddtests.utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import bddtests.utils.BrowserDriver.*;

public class Hooks extends BrowserDriver{

    String newLine = System.getProperty("line.separator");

    @Before()
    public void startSelenium() {
        System.out.println("starting driver.." + newLine);
        BrowserDriver driver = new BrowserDriver();
        driver.loadDriver();
    }

    @After()
    public void stopSelenium() {
        System.out.println("closing driver.." + newLine);
        driver.quit();
    }
}
