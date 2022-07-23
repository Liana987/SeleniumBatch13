package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //go to google.com
      //  driver.get("https://google.com");
      //  driver.navigate().to("https://google.com");
        //div(division) is used to divide the webpage into separate portions

        //got to syntaxprojects.com
        driver.get("https://www.syntaxprojects.com/index.php");
        //click on "start practicing"
        //Thread.sleep(2000);//check if the page has loaded successfully
        WebElement button1=driver.findElement(By.linkText("Start Practising"));
        button1.click();
        Thread.sleep(2000);
        //very important is to read the errors, it is 80% of the job done\
        driver.findElement(By.partialLinkText("Proceed Next")).click();//this approach was for practice,
        //do not use it in real life

        //goto https://syntaxprojects.com/basic-first-form-demo.php

        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
//        enter some value in the text box
        WebElement textBox = driver.findElement(By.id("user-message"));//when we have find Element always
        //store find element variables into WebElement
        textBox.sendKeys("abracadrba");

    }
}
