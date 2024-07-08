package org.abhishek.selenium.ebbay;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ebbay {

    EdgeDriver driver;
    @BeforeTest
     public void openBrowser() {


        EdgeOptions options = new EdgeOptions();

        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(options);


    }

    @Test
    public void PositiveTest() throws InterruptedException {
        driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2499334.m570.l1311&_nkw=macbook+pro&_sacat=32852");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        WebElement searchboc = driver.findElement(By.xpath("//input[@id=\"gh-btn\"]"));
        searchboc.sendKeys("MacBook Pro");
        WebElement searchboxSubmit= driver.findElement(By.cssSelector("input[value=\"Search\"]"));
        searchboxSubmit.click();


        List<WebElement> SearchHeading = driver.findElements(By.xpath("//div[@class=\"s-item__title\"]/span"));
        for (WebElement heading : SearchHeading) {

            System.out.println("Title is:"+heading.getText());
        }



    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
