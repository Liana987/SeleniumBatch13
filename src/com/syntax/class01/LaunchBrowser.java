package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // setting the property to use chromedriver

        //which driver will I be using-built in value, second argument where the driver is located
        // for windows users add extension .exe
        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.get("http://www.google.com");
        //if an error "the driver executable does not exist" shows up, it means that there is a typo
        //in the set Property or that driver does not exist inside this driver
        String url = driver.getCurrentUrl();//when using this we are getting the current url but
        //in a form of String value
        System.out.println(url);// as long as we have it in the RUN console as the url it is correctly done
        String title = driver.getTitle();//it is always on the tab, in this case DownloadsSelenium
        System.out.println(title);
        driver.quit();//to close the browser
        //we can print the title and url if we concanate them using variables sysout -title + url
    }
}