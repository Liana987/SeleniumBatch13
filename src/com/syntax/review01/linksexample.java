package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class linksexample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        get all the links from the website of syntax

//        goto the website
        driver.get("https://syntaxprojects.com/index.php");

// get all the links(in IT, divide into steps and approach the solution step by step
        List<WebElement> links = driver.findElements(By.tagName("a"));
        //when looking for a list, go to the DOM and see how many links are there, put //a in the
        //seach bar and it will show how many links we have on the page
        //we have to see what is the return type and see when you point cursor, it tells you what the return ir
        //just point on findElements links = driver.findElements(By.tagName("a"));
//print it out on the console
        for(WebElement link :links){
            String text = link.getText();//get the text from the links
            System.out.println(text);//print out the text
            //if we used the sout(links) it would print the links on the console in one line
        }
    }
}
