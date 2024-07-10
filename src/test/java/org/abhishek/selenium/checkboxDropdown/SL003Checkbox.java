package org.abhishek.selenium.checkboxDropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SL003Checkbox {

    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List <WebElement> checkboxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
        WebElement ch = checkboxes.get(0);


        ch.click();


    }

    @Test
    public void alerts(){

    }

    @BeforeTest
    public void closeBrowser(){

    }
}
