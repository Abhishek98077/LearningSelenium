package org.abhishek.selenium.Studlence;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class stLoginDash {
    @Test
    @Description("this is studlence login positive test with user-pass and enter to the dashboard")

    public void testLoginPositive() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.studlence.com/login");
        System.out.println("Title of the page is :"+driver.getTitle());

        WebElement inputBox = driver.findElement(By.name("email"));
        inputBox.sendKeys("rishut195@gmail.com");
        WebElement password = driver.findElement((By.name("password")));
        password.sendKeys("password");

        driver.findElement(By.xpath("//button[@class='tp-btn  w-100'][1]")).click();
        Thread.sleep(3000);

        Assert.assertEquals(driver.getTitle() ,"Studlence");

        driver.findElement(By.xpath("//button[@class=\"btn btn-ghost-dark btn-block btnout\"][1]")).click();

        Thread.sleep(3000);

        driver.quit();




    }
}
