package org.abhishek.selenium.Actions;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SL001KeyBoardShift {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new EdgeDriver();

    }

    //
    @Test
    public void test() throws InterruptedException{
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        WebElement el = driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions actions =new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(el,"abhishekMailiniAnsu").keyUp(Keys.SHIFT).build().perform();

        WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Click here to Download File')]"));

        actions.contextClick(link).build().perform();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3000));




    }

    @AfterTest
    public void tearDown() {
            driver.quit();
    }
}
