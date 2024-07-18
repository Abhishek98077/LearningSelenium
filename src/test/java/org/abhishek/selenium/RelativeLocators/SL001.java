package org.abhishek.selenium.RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class SL001 {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new EdgeDriver();

    }

    //
    @Test
    public void test() throws InterruptedException{
        driver.get("https://www.aqi.in/in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();
        WebElement serch = driver.findElement(By.id("search_city"));
        serch.sendKeys("India"+Keys.ENTER);
    Thread.sleep(5000);

    List<WebElement> states = driver.findElements(By.xpath("//table[@id=\"example\"]/tbody/tr/td[2]"));

    for (WebElement s: states){
        String s1 = String.valueOf(driver.findElement(with(By.tagName("p")).toRightOf(s)).getText());
        String s2 = String.valueOf(driver.findElement(with(By.tagName("p")).toLeftOf(s)).getText());
        System.out.println(s.getText()+"this is "+s1+s2);
    }

    }

    @AfterTest
    public void tearDown() {
//        driver.quit();
    }
}
