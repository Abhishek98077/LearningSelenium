package org.abhishek.selenium.DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class SL001 {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new EdgeDriver();

    }

    //
    @Test
    public void test() throws InterruptedException{
        driver.get("https://the-internet.herokuapp.com/windows");

        driver.manage().window().maximize();
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("beforeKey"+mainWindowHandle);
        WebElement el = driver.findElement(By.linkText("Click Here"));
        el.click();
        Set<String> windowHandles = driver.getWindowHandles();
//        System.out.println("boreKey"+windowHandles);
        for (String Handles : windowHandles){
            driver.switchTo().window(Handles);
            if (driver.getPageSource().contains("New Window")){
                System.out.println("TC Pass");
            }
        }

    }

    @AfterTest
    public void tearDown() {
//        driver.quit();
    }
}
