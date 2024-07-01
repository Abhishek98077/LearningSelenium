package org.abhishek.selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SL004headless {
    public static void main(String[] args)
    {

            EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");
            options.addArguments("--start-maximized");
            options.addArguments("--window-size=800,600");
            EdgeDriver driver = new EdgeDriver(options);
            driver.get("https://www.google.com");
            System.out.println(driver.getTitle());
            driver.quit();
    }

}
