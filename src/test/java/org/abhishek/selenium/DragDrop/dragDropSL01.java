package org.abhishek.selenium.DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class dragDropSL01 {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new EdgeDriver();

    }

    //
    @Test
    public void test() throws InterruptedException{
        driver.get("https://www.studlence.com");
//        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();


    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

