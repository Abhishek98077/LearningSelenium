package org.abhishek.selenium.katalonProject;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PositiveTC {
    WebDriver driver;
    @BeforeTest
    public void setUp() {
        driver  = new EdgeDriver();

    }

    @Test
    @Description("this is a positive testcase for this app")
    public void TestWebsite() throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement element = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        element.click();

        driver.findElement(By.xpath("//input[@id=\"txt-username\"]")).sendKeys("John Doe");
        driver.findElement(By.xpath("//input[@id=\"txt-password\"]")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.xpath("//button[@id='btn-login']")).click();

//        WebElement selectElement = driver.findElements(By.cssSelector("#combo_facility"));
//        WebElement SElement = driver.findElements(By.cssSelector("#combo_facility")).get(1);
        WebElement EL = driver.findElement(By.cssSelector("#combo_facility"));
        Select select = new Select(EL);
        select.selectByIndex(1);

        driver.findElement(By.cssSelector("#chk_hospotal_readmission")).click();
        driver.findElement(By.cssSelector("#radio_program_medicaid")).click();
        driver.findElement(By.cssSelector("#txt_visit_date")).sendKeys("02/07/2024");
        driver.findElement(By.cssSelector("#txt_comment")).sendKeys("Hi this is My first Automation");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#btn-book-appointment")).click();

        String Response = driver.findElement(By.cssSelector("#comment")).getText();


        Assert.assertEquals(Response,"Hi this is My first Automation");


    }

    @AfterTest
    public void tearDown(){
    driver.quit();
    }

}
