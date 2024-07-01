package org.abhishek.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SL001 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.studlence.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}
