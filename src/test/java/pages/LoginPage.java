package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement getUsernameInput;

    @FindBy(id = "password")
    private WebElement PasswordInput;

    @FindBy(id = "login-button")
    private WebElement loginBtn;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ProductPage Login(String username, String password) {
        getUsernameInput.click();
        getUsernameInput.clear();
        getUsernameInput.sendKeys(username);

        PasswordInput.click();
        PasswordInput.clear();
        PasswordInput.sendKeys(password);

        loginBtn.click();
        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error'"));
        Assert.assertTrue(errorMessage.isDisplayed());
        return null;
    }
}