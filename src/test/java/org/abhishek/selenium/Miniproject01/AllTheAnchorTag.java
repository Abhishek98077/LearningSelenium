package org.abhishek.selenium.Miniproject01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class AllTheAnchorTag {
    @Test
    public void testAllTheAnchorTag() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        List<WebElement> tags = driver.findElements(By.tagName("a"));
        tags.get(0).click();
        for (WebElement element : tags) {
            System.out.println(element.getText());
        }

        driver.close();


    }
}
