package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleSearchTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Headless mode (no GUI)
        options.addArguments("--disable-gpu"); // Disable GPU (for headless systems)
        options.addArguments("--no-sandbox"); // Disable sandbox for Linux
        driver = new ChromeDriver(options);
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
