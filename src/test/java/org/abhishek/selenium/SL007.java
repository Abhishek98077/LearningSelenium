package org.abhishek.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SL007 {

    @Test
    @Description("Verify The Current Url , Title of given website")
    public void Test001() {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "htts://app.vwo.com/#/login");
        driver.quit();
    }
}
