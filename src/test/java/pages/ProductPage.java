package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(id="react-burger-menu-btn")
    private WebElement menuActions;
    public ProductPage(WebDriver driver) {
        super(driver);

    }
}
