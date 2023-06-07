package testPOM;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class AddProductsInCartTest extends TestUtil {

    @Test

    public void addItemToCart() {

        LoginPage loginTest = new LoginPage(driver);
        ProductPage productPage = loginTest.Login("standard_user", "secret_sauce");

        productPage.addItemInToCart("bike-light");
        Assert.assertEquals(productPage.getItemInCart(), 1);

        productPage.addItemInToCart("bolt-t-shirt");
        Assert.assertEquals(productPage.getItemInCart(), 2);

        productPage.clickShoppingCart();


    }
}
