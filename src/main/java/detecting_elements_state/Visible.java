package detecting_elements_state;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author F8872249
 * @Project_Name IntelliJ IDEA
 * @date 2025/02/22
 * @description Visible - Brief description of this class.
 */
public class Visible {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/coordinates_tests/page_with_hidden_element.htm");

        WebElement isVisible = driver.findElement(By.id("box"));
        if (isVisible.isDisplayed()) {
            isVisible.click();
        } else {
            System.out.println("Element is not visible");
        }
    }
}
