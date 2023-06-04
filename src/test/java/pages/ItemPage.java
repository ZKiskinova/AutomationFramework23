package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage{

    @FindBy(id="header_container")
    private WebElement productPageProducts;

    private final static String PRODUCT_ID = "add-to-cart-sauce-labs-";
    WebElement itemToBeAdded = driver.findElement(By.id(PRODUCT_ID + itemName));
    itemToBeAdded.click();

    public ItemPage(WebDriver driver) {
        super(driver);
    }
}
