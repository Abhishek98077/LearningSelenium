package org.abhishek.selenium.MakeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SL001 {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();

    }

    //
    @Test
    public void test() throws InterruptedException{
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        Thread.sleep(4000);

        WebElement popup = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        popup.click();
        WebElement el = driver.findElement(By.id("fromCity"));

        Actions action = new Actions(driver);
        action.moveToElement(el).perform();
        Thread.sleep(2000);
        action.moveToElement(el).click().sendKeys("Mum").build().perform();

        List<WebElement> Lis = driver.findElements(By.xpath("//div[@id='react-autowhatever-1']/div/ul/li"));
        for(WebElement l: Lis){

            if (l.getText().contains("Mumbai")){
                l.click();
                break;
            }
        }

        Thread.sleep(4000);


    }

    @AfterTest
    public void tearDown() {
//        driver.quit();
    }
}
