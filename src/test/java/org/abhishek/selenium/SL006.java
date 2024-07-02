package org.abhishek.selenium;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SL006 {
    public static void main(String[] args) throws MalformedURLException {
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("http://www.studlence.com");
        edgeDriver.navigate().to(new URL("http://www.google.com"));
        edgeDriver.navigate().back();
        edgeDriver.navigate().forward();
        edgeDriver.navigate().refresh();


    }
}
