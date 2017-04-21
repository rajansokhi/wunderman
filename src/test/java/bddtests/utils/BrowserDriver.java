package bddtests.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver {

    public static WebDriver driver;

    public static void loadDriver(){
        System.setProperty("webdriver.firefox.bin", "/Applications/Firefox 2.app/Contents/MacOS/firefox-bin");
        driver = new FirefoxDriver();
    }

    public static void loadPage(String url){
        driver.get(url);
    }



}
