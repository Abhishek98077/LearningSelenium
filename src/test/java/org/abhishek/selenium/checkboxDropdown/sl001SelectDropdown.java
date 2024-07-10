package org.abhishek.selenium.checkboxDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sl001SelectDropdown {

    WebDriver driver;


    @BeforeTest
    public void setUp() {
        driver = new EdgeDriver();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement selectElement = driver.findElement(By.id("dropdown"));
        Select select = new Select(selectElement);
        select.selectByIndex(1);
        Thread.sleep(5000);

    }

    @AfterTest
    public void tearDown() {

    }
}
