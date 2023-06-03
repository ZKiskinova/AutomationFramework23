package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage{

    @FindBy(id="header_container")
    private WebElement productPageProducts;


    public ItemPage(WebDriver driver) {
        super(driver);
    }
}
