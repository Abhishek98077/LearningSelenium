package org.abhishek.selenium.Studlence;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginNegativeTC {

    @Test
    @Description("this is a negative testCase for loginPage using wrong id and password")

    public void FirstNegativeTC(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://studlence.com/login");
        System.out.println(driver.getTitle());
        WebElement LoginInputBox = driver.findElement(By.name("email"));
        LoginInputBox.sendKeys("rishut195@gmail.com");
        WebElement PasswordInputBox = driver.findElement(By.name("password"));
        PasswordInputBox.sendKeys("adminadminadminadminadminadminadminadmin");

        driver.findElement(By.className("tp-btn")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement response = driver.findElement(By.className("alert"));
        String ErrorMessage = response.getText();
//        System.out.println(ErrorMessage);
        Assert.assertEquals(ErrorMessage,"Opps! You have entered invalid credentials.");



    }
}
