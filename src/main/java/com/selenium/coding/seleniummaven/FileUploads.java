package com.selenium.coding.seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author F8872249
 * @Project_Name IntelliJ IDEA
 * @date 2025/02/20
 * @description FileUploads - Brief description of this class.
 */
public class FileUploads {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev/selenium/web/web-form.html");

        String filePath = "C:\\Users\\f8872249\\workspace\\selenium-maven\\src\\main\\resources\\file.txt";

        WebElement file = driver.findElement(By.name("my-file"));

        file.sendKeys(filePath);
    }
}
