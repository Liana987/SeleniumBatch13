package com.syntax.class08;

import org.openqa.selenium.WebDriver;

public class HwCommonMethods {
    public static void openBrowser(WebDriver driver, String url){
        driver.manage().window().maximize();
        driver.get(url);
    }
    public static void quitBrowser(WebDriver driver){
        driver.quit();
    }
}