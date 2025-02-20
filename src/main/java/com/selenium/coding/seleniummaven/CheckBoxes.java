package com.selenium.coding.seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author F8872249
 * @Project_Name Selenium
 * @date 2025/02/20
 * @description CheckBoxes - Understanding how to use selenium with checkboxes
 */
public class CheckBoxes {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev/selenium/web/web-form.html");

        WebElement checkbox = driver.findElement(By.id("my-check-1"));
        boolean isSelected = checkbox.isSelected();

        if (!isSelected) {
            checkbox.click();
        }

        driver.quit();
    }
}
