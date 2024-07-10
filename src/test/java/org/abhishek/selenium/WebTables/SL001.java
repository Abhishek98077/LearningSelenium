package org.abhishek.selenium.checkboxDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SL001 {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {


        // Initialize the Edge driver
        driver = new EdgeDriver();
    }

    @Test
    public void table() {
        // Navigate to the specified URL
        driver.get("https://awesomeqa.com/webtable.html");

        // XPath parts to construct the complete XPath for each cell
        String firstPart = "//table[@id=\"customers\"]/tbody/tr[";
        String secondPart = "]/td[";
        String thirdPart = "]";

        // Count the number of rows and columns
        int rows = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int cols = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        // Iterate through each cell in the table and print its content
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                String path = firstPart + i + secondPart + j + thirdPart;
                String data = driver.findElement(By.xpath(path)).getText();
//                System.out.println(data);

                if (data.contains("Google")){
                    String countryPath = path+"/following-sibling:: td";
                    String cText = driver.findElement(By.xpath(countryPath)).getText();
                    System.out.println("in"+cText);

                }
            }
        }
    }

    @AfterTest
    public void closeBrowser() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
