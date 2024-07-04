package org.abhishek.selenium.Miniproject01;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class loginpage2 {
    @Test
    @Description("linktext")
    public void verifyLogin1() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        WebElement AnchorTag = driver.findElement(By.partialLinkText("Start a free trial"));
        System.out.println(AnchorTag.getAttribute("href"));
        AnchorTag.click();
        driver.close();

    }
}
