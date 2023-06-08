package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodByePage extends BasePage{

    @FindBy(className="complete-header")
    private WebElement ThankYouForYourOrder;

    public GoodByePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
}
