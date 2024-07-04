package org.abhishek.selenium.MiniProject2Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SL002 {
    @Test

    public void testSL001() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement button2 = driver.findElement(By.id("btn-make-appointment"));

//        WebElement button = driver.findElement(By.className("btn.btn-dark.btn-lg"));
//        WebElement button1 = driver.findElement(By.partialLinkText("btn.btn-dark.btn-lg"));
//        WebElement button11 = driver.findElement(By.linkText("btn.btn-dark.btn-lg"));
//        WebElement button111 = driver.findElement(By.ByXPath("//a[@href='./profile.php#login']"));
        button2.click();
        Thread.sleep(4000);
//        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");

        WebElement uName = driver.findElement(By.id("txt-username"));
        uName.sendKeys("John Doe");
        WebElement password = driver.findElement(By.xpath("//input[@id='txt-password']"));
        password.sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());


        driver.close();


    }
}
