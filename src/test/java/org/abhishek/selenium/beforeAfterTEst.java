package org.abhishek.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforeAfterTEst {
    EdgeDriver driver;


    @BeforeTest
    public void openBrowser() {
        driver = new EdgeDriver();
        driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2499334.m570.l1311&_nkw=macbook+pro&_sacat=32852");
        
    }


















    @Test
    @Description("this is a test")
    public void positiveTestCase() {

    }

    public void negativeTestCase() {

    }


















    @AfterTest
    public void closeBrowser() {
    driver.quit();
    }
}
