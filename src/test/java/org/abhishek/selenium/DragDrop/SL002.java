package org.abhishek.selenium.DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SL002 {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new EdgeDriver();

    }

    //
    @Test
    public void test() throws InterruptedException{
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));

//        actions.dragAndDrop(from,to).build().perform();
        actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
        Thread.sleep(4000);

        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement box =driver.findElement(By.id("fileToUpload"));
//        String dir  =System.getProperty("user.dir");
        box.sendKeys("C:\\Users\\Asus\\IdeaProjects\\LearnSelenium\\src\\test\\java\\org\\abhishek\\selenium\\DragDrop\\abc.txt");
//        box.sendKeys("");
        driver.findElement(By.name("submit")).click();
    }

    @AfterTest
    public void tearDown() {
//        driver.quit();
    }
}
