package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductPage extends BasePage {

    private final static String PRODUCT_ID = "add-to-cart-sauce-labs-";

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addItemInToCart(String itemName) {
        WebElement itemToBeAdded = driver.findElement(By.id(PRODUCT_ID + itemName));
        itemToBeAdded.click();

        WebElement shoppingCartBadge = driver.findElement(By.className("shopping_cart_badge"));
        Assert.assertEquals(shoppingCartBadge.getText(), "1");
    }


    }
