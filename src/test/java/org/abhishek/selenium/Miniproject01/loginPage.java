package org.abhishek.selenium.Miniproject01;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginPage {

    @Test(priority = 1)
    @Description("login using wrong id and password")
    public void loginNegativeTest() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), "Login - VWO");

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@rishu.com");
        WebElement PasswordBox = driver.findElement(By.name("password"));
        PasswordBox.sendKeys("admin");

        driver.findElement(By.id("js-login-btn")).click();
//        Thread.sleep(3000);
        Thread.sleep(3000);
        WebElement message = driver.findElement(By.className("notification-box-description"));
        String ErrorMessage =message.getText();
        Assert.assertEquals(ErrorMessage ,"Your email, password, IP address or location did not match");
        driver.close();


    }
}
