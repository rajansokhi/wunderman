package bddtests.utils;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait extends BrowserDriver {

    public static WebDriverWait wait = new WebDriverWait(driver, 40);

}

