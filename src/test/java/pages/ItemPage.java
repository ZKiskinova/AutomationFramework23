package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage{

    @FindBy( id="shopping_cart_container");
    private WebElement shoppingCart;


    public ItemPage(WebDriver driver) {
        super(driver);
    }
}
