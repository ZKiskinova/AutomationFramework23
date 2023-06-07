package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    }
    public FinalPage FillUp(String firstname, String lastname, String postalcode) {

        firstName.click();
        firstName.clear();
        firstName.sendKeys();

        lastName.click();
        lastName.clear();
        lastName.sendKeys();

        postalCode.click();
        postalCode.clear();
        postalCode.sendKeys();

        continueBtn.click();
        return new FinalPage(driver);

    }
}
