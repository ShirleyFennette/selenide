import com.codeborne.selenide.Configuration;

public class BaseTest {
    static {
        // Configure Selenide for Chrome in CI/CD environments
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.browserBinary = "/usr/bin/chromium-browser";
        System.setProperty("webdriver.chrome.driver", System.getenv("CHROMEDRIVER_PATH") != null 
            ? System.getenv("CHROMEDRIVER_PATH") 
            : "/usr/bin/chromedriver");
        System.setProperty("webdriver.chrome.args", "--no-sandbox,--disable-dev-shm-usage");
    }
}
