package org.abhishek.selenium.SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class mCharts {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new EdgeDriver();
    }

    //
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for (WebElement statesElement : states) {
            System.out.println(statesElement.getAttribute("aria-label"));
            if (statesElement.getAttribute("aria-label").contains("Himachal Pradesh")){
                statesElement.click();
            }
        }
        Thread.sleep(5000);


    }

    @AfterTest
    public void tearDown() {

    }
}
