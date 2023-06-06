package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestUtil {
    public WebDriver driver;
    public String appURL, browser;
    public int implicitWait;

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @BeforeMethod
    public void setupDriverAndOpenTestAddress() {
        readFromFile();
        setupWebDriver();
        driver.get(appURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
    }

    private void readFromFile () {
        try {
            FileInputStream confFile = new FileInputStream("src/test/resources/config.properties");
            Properties properties = new Properties();
            properties.load(confFile);
            appURL = properties.getProperty("testURL");
            browser = properties.getProperty("browser");
            implicitWait = Integer.parseInt(properties.getProperty("implicitWait"));
        } catch (IOException e) {

            System.out.println("File is not found");
        }

    }
    private void setupWebDriver(){
        switch (browser) {
            case "chrome" -> driver = setupChromeDriver();
            case "opera" -> driver = setupOperaDriver();
        }

    }

    private WebDriver setupChromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    private WebDriver setupOperaDriver(){
        WebDriverManager.operadriver().setup();
        return (WebDriver) new OperaDriverManager();
    }


}