package org.abhishek.selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SL005pageLoadStrategy {
    public static void main(String[] args) {
        EdgeOptions edge = new EdgeOptions();
        edge.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new EdgeDriver(edge);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
