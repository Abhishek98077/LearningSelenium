package org.abhishek.selenium.iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Sl001 {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new EdgeDriver();

    }

    //
    @Test
    public void test() throws InterruptedException{
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();
        driver.switchTo().frame("result");
        WebElement submit = driver.findElement(By.cssSelector("form[id='form'] button"));
        submit.click();

        WebElement el = driver.findElement(By.id("username"));
//        WebElement errorMessage = driver.findElement(By.tagName("small")).getLocation(el);
        WebElement erms = driver.findElement(with(By.tagName("small")).below(el));
        String err = erms.getText();
        Assert.assertEquals(err,"Username must be at least 3 characters");
        Thread.sleep(3000);

    }

    @AfterTest
    public void tearDown() {
//        driver.quit();
    }
}
