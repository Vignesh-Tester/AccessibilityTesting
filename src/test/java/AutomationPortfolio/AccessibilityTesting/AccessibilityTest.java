package AutomationPortfolio.AccessibilityTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccessibilityTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vignesh.thangavel\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testAccessibility() {
        HomePage homePage = new HomePage(driver);
        homePage.open();

        AxeUtils.runAccessibilityChecks(driver);
        // Alternatively, use AxeUtils.analyzeAccessibilityIssues(driver) to print the accessibility issues without failing the test
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
