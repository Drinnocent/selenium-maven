package com.selenium.coding.seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This peace of code allows you to set your name in the text box using find by name
 * **/

public class Textboxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev/selenium/web/formPage.html");

        WebElement textBox = driver.findElement(By.name("id-name1"));

        textBox.getText();
        textBox.clear();
        textBox.sendKeys("Doctor");

        //driver.quit();
    }

}
