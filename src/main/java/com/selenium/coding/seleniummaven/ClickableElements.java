package com.selenium.coding.seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickableElements {
    public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();

            driver.get("https://selenium.dev/selenium/web/web-form.html");

            //Start from the root to find that element
           driver.findElement(By.xpath("//button[text()='Submit']")).click();

            //Clicking the link
        driver.findElement(By.xpath("//a[normalize-space(text())='Return to index']")).click();

    }
}
