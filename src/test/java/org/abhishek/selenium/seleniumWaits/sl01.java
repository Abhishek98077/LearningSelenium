package org.abhishek.selenium.seleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class sl01 {
//    @Test
    public void Negativetest() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("rishut195@gmail.com");
        WebElement PasswordBox = driver.findElement(By.name("password"));
        PasswordBox.sendKeys("Abhishek@1811d999");
        driver.findElement(By.id("js-login-btn")).click();

        WebElement message = driver.findElement(By.className("notification-box-description"));

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3000));

        webDriverWait.until(ExpectedConditions.textToBePresentInElement(message ,"Your email, password, IP address or location did not match"));
        System.out.println("1 ----->" + message.getText());
    }
    @Test
    public void positiveTC(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("rishut195@gmail.com");
        WebElement PasswordBox = driver.findElement(By.name("password"));
        PasswordBox.sendKeys("Abhishek@1811999");
        driver.findElement(By.id("js-login-btn")).click();

        WebElement message = driver.findElement(By.className("notification-box-description"));
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10000));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[data-qa=\"page-sub-title\"]")));
        WebElement username = driver.findElement(By.cssSelector("[data-qa=\"page-sub-title\"]"));

        System.out.println("2 ----->" + username.getText());
    }
}
