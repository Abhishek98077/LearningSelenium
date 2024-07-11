package org.abhishek.selenium.shadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SL001 {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new EdgeDriver();
    }

    //
    @Test
    public void test() throws InterruptedException {
        driver.get("https://selectorshub.com/xpath-practice-page/");
        JavascriptExecutor js= (JavascriptExecutor) driver;

        Thread.sleep(3000);
        WebElement el = driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true)", el);

        WebElement e= (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div\").shadowRoot.querySelector(\"input#pizza\")");

        e.sendKeys("Farmhouse");


    }

    @AfterTest
    public void tearDown() {

    }
}
