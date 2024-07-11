package org.abhishek.selenium.SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class findSVG {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
    driver = new EdgeDriver();
    }

    //
    @Test
    public void test() {
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.name("q")).sendKeys("mackMini");
//       driver.findElement(By.xpath("//*[local-name()='svg']/*[local-name()='path' and @stroke='#717478'][1]")).click();
//       driver.findElement(By.xpath("button[@title='Search for Products, Brands and More']//*[name()='svg']")).click();
       driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']//*[name()='svg']")).click();


    }

    @AfterTest
    public void tearDown() {

    }
}
