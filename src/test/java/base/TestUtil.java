package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestUtil {
    public WebDriver driver;

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @BeforeMethod
    public void setupDriverAndOpenTestAddress(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://login-emea.docuware.cloud/09395349-8abf-412f-a20e-072eb2ae403a/Account/Login?ReturnUrl=%2F09395349-8abf-412f-a20e-072eb2ae403a%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3Ddocuware.platform.webclient%26redirect_uri%3Dhttps%253A%252F%252Fnemetschek.docuware.cloud%252FDocuWare%252FPlatform%252FWebClient%252FClient%252FLoginCallback%26response_type%3Dcode%26scope%3Dopenid%2520docuware.platform%2520docuware.workflow.service%2520docuware.idservice.api%26state%3D6e66c88e7253466c922f67b822dae1ec%26code_challenge%3DFvfh8ezGZKzZg6R6EecHog3wDFivAWC9nVWSDfIu26M%26code_challenge_method%3DS256%26response_mode%3Dquery%26acr_values%3Dtenant%253A09395349-8abf-412f-a20e-072eb2ae403a%26prompt%3Dlogin%26suppressed_prompt%3Dlogin");

    }

}
