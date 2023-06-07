package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    private final static String PRODUCT_ID = "add-to-cart-sauce-labs-";

    @FindBy(className = "title")
    private WebElement pageTitle;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement userMenuBtn;

    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCart;

    @FindBy(className = "shopping_cart_badge")
    private WebElement shoppingCartBadge;

    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void addItemInToCart(String itemName) {
        WebElement itemToBeAdded = driver.findElement(By.id(PRODUCT_ID + itemName));
        itemToBeAdded.click();
    }

    public int getItemInCart() {
        return Integer.parseInt(shoppingCartBadge.getText());
    }

    public void CheckoutPage() {
        shoppingCart.click();
         new CheckoutPage(driver);

}

    }



