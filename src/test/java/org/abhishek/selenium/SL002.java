package org.abhishek.selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class SL002 {

    @Test
    public void testMethod() {
        WebDriver driver = new ChromeDriver();
        WebDriver driver2 = new EdgeDriver();
        WebDriver driver3 = new FirefoxDriver();
        WebDriver driver4 = new InternetExplorerDriver();
        WebDriver driver5 = new SafariDriver();

        WebDriver driver6 = new ChromeDriver();
        driver6.get("https://www.google.com");


    }
}
