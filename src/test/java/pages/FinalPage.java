package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalPage extends BasePage{

    @FindBy(id="finish")
    private WebElement finishBtn;
    public FinalPage(WebDriver driver) {
        super(driver);
    }
    public GoodByePage FinishOrder(){
        finishBtn.click();
        return new GoodByePage(driver);
    }
}
