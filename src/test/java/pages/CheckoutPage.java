package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckoutPage extends BasePage {


    @FindBy(id = "checkout")
    private WebElement buttonCheckout;


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void ClickOnCheckout(){
        buttonCheckout.click();
        new BayerInformationPage(driver);

    }
}


