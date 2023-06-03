package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement PasswordInput;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

        public ItemPage login(String userName, String Password){
        userNameInput.click();
        userNameInput.clear();
        userNameInput.sendKeys(userName);

        PasswordInput.click();
        PasswordInput.clear();
        PasswordInput.sendKeys(Password);

        loginBtn.click();
        WebElement task = driver.findElement(By.id( );
        return new ItemPage(driver);
        }
    }
