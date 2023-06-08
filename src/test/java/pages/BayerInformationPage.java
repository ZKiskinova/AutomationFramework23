package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BayerInformationPage extends BasePage{

    @FindBy(id="first-name")
    private WebElement firstName;

    @FindBy(id="last-name")
    private WebElement lastName;

    @FindBy(id="postal-code")
    private WebElement postalCode;

    @FindBy(id = "continue")
    private WebElement continueBtn;

    public BayerInformationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);

    }
    public FinalPage FillUp(String firstname, String lastname, String postalcode) {

        firstName.click();
        firstName.clear();
        firstName.sendKeys(firstname);

        lastName.click();
        lastName.clear();
        lastName.sendKeys(lastname);

        postalCode.click();
        postalCode.clear();
        postalCode.sendKeys(postalcode);

        continueBtn.click();
        return new FinalPage(driver);

    }
}
