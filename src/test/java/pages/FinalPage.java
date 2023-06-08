package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage extends BasePage{

    @FindBy(id="finish")
    private WebElement finishBtn;
    public FinalPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void  FinishOrder(){
        finishBtn.click();
         new GoodByePage(driver);
    }
}
