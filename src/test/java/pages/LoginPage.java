package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "Username")
    private WebElement userNameInput;

    @FindBy(id = "Password")
    private WebElement PasswordInput;

    @FindBy(id = "loginBtn")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

        public DocuWarePage login(String userName, String Password){
        userNameInput.click();
        userNameInput.clear();
        userNameInput.sendKeys(userName);

        PasswordInput.click();
        PasswordInput.clear();
        PasswordInput.sendKeys(Password);

        loginBtn.click();
        return new DocuWarePage(driver);
        }
    }
