package detecting_elements_state;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author F8872249
 * @Project_Name IntelliJ IDEA
 * @date 2025/02/22
 * @description Displayed - Brief description of this class.
 */
public class Displayed {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev/selenium/web/web-form.html");

        boolean isVisible = driver.findElement(By.name("my-hidden")).isDisplayed();
        System.out.println(isVisible);
    }
}
