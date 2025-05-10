package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class GoogleSearchTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        // If you're running headless or from Jenkins, enable headless mode.
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleHomePageTitle() {
        driver.get("https://www.google.com");
        assert driver.getTitle().contains("Google");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
