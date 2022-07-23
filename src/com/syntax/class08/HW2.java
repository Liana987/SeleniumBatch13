package com.syntax.class08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
   create a package and name it as utils
create a class and name as CommonMethods
create functions (methods) to open and quit the browsers
open method has to accept a url as a parameter
    */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        CommonMethods.openBrowser(driver,"https://google.com/");
        CommonMethods.quitBrowser(driver);
    }

    private static class CommonMethods {
        public static void openBrowser(WebDriver driver, String url){
            driver.manage().window().maximize();
            driver.get(url);
        }
        public static void quitBrowser(WebDriver driver){
            driver.quit();
        }
    }
    }




