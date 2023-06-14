package AutomationPortfolio.AccessibilityTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("http://yourwebsite.com");
    }

    public WebElement getLogoElement() {
        return driver.findElement(By.id("logo"));
    }
}
