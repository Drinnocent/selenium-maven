package detecting_elements_state;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author F8872249
 * @Project_Name IntelliJ IDEA
 * @date 2025/02/22
 * @description Disabled - Brief description of this class.
 */
public class Disabled {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev/selenium/web/web-form.html");

        boolean isEnabled = driver.findElement(By.name("my-disabled")).isEnabled();

        System.out.println(isEnabled);
    }
}
