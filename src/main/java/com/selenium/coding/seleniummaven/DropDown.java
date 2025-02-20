package com.selenium.coding.seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * @author F8872249
 * @Project_Name IntelliJ IDEA
 * @date 2025/02/20
 * @description DropDown - Brief description of this class.
 */
public class DropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev/selenium/web/web-form.html");

        Select dropdown = new Select(driver.findElement(By.name("my-select")));
        dropdown.selectByValue("2");  // select value two
        dropdown.selectByVisibleText("Three"); // select by what is displayed
        dropdown.selectByIndex(1);

        WebElement selectedOption = dropdown.getFirstSelectedOption();

        List<WebElement> options = dropdown.getAllSelectedOptions(); //get all options from a multi select options

        // This only works with mutli select but single select will give an exception
        dropdown.deselectByValue("2");
        dropdown.deselectByVisibleText("Three");
    }
}
