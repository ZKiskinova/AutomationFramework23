package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoodByePage extends BasePage{

    @FindBy(className="complete-header")
    private WebElement ThankYouForYourOrder;

    public GoodByePage(WebDriver driver) {
        super(driver);
    }
}
