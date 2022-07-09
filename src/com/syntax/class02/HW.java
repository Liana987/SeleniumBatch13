package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {

    /*
    HW
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Jane");
        driver.findElement(By.name("customer.lastName")).sendKeys("Doe");
        driver.findElement(By.id("customer.address.street")).sendKeys("511 Wenden Lane");
        driver.findElement(By.name("customer.address.city")).sendKeys("Chicago");
        driver.findElement(By.id("customer.address.state")).sendKeys("Illinois");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("IL 60462");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("648-487-3214");
        driver.findElement((By.name("customer.ssn"))).sendKeys("654-88-8769");
        driver.findElement(By.id("customer.username")).sendKeys("forgottenname");
        driver.findElement(By.name("customer.password")).sendKeys("12345678Name");
        driver.findElement(By.id("repeatedPassword")).sendKeys("12345678Name");
        driver.findElement(By.cssSelector("input[value=Register]")).click();
        driver.quit();

        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://www.fb.com/");
        driver1.manage().window().maximize();
        driver1.findElement(By.cssSelector("a[data-testid=open-registration-form-button]")).click();
        Thread.sleep(2000);
        driver1.findElement(By.name("firstname")).sendKeys("Jane");
        driver1.findElement(By.name("lastname")).sendKeys("Doe");
        driver1.findElement(By.name("reg_email__")).sendKeys("648-487-3214");
        driver1.findElement(By.name("reg_passwd__")).sendKeys("Name23kf");
        driver1.findElement(By.name("birthday_month")).sendKeys("Aug");
        driver1.findElement(By.name("birthday_day")).sendKeys("6");
        driver1.findElement(By.name("birthday_year")).sendKeys("1965");
        driver1.findElement(By.cssSelector("input._8esa[value='1']")).click();
        Thread.sleep(2000);
        driver1.findElement(By.xpath("//button[text()='Sign Up']")).click();
        Thread.sleep(2000);
        driver1.findElement(By.cssSelector("img[src='https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png']")).click();
        Thread.sleep(2000);
        driver1.quit();

    }
}