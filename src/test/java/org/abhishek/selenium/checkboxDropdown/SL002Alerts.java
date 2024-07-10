package org.abhishek.selenium.checkboxDropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SL002Alerts {

    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        WebElement element = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
//        WebElement element1 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        WebElement element2 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));


//        element.click();
//        element1.click();
        element2.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Abhishek");
        alert.accept();
        String result = driver.findElement(By.id("result")).getText();

//        Assert.assertEquals(result,"You successfully clicked an alert");
        Assert.assertEquals(result,"You entered: abhishek");




    }

    @Test
    public void alerts(){

    }

    @BeforeTest
    public void closeBrowser(){

    }
}
