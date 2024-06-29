package org.abhishek;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test01 {


    @Test
    @Description("this is my first test")
    public void StudlenceTestTitle(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.studlence.com/");
        System.out.println(driver.getTitle());
    }
}
