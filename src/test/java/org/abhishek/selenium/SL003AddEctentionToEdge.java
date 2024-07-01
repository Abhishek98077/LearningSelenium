package org.abhishek.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class SL003AddEctentionToEdge {
    @Test

    public void test01() {
        // Extention  to a edge browser
        // i play a youtuve video i get add ad adblocker
        EdgeOptions options = new EdgeOptions();
        options.addExtensions(new File("C:\\Users\\Asus\\Downloads\\Adblock-Plus-free-ad-blocker.crx"));
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.youtube.com");


    }


}
