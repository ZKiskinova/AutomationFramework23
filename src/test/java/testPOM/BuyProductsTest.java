package testPOM;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class BuyProductsTest extends TestUtil {

    @Test
    public void CheckOutClick(){

        LoginPage loginTest = new LoginPage(driver);
        ProductPage productPage = loginTest.Login("standard_user", "secret_sauce");

        productPage.addItemInToCart("bike-light");
        Assert.assertEquals(productPage.getItemInCart(), 1);

        productPage.addItemInToCart("bolt-t-shirt");
        Assert.assertEquals(productPage.getItemInCart(), 2);

        productPage.clickShoppingCart();


        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.ClickOnCheckout();

        BayerInformationPage bayerInformationPage =  new BayerInformationPage(driver);
        FinalPage finalPage = bayerInformationPage.FillUp("Zlatina","Koleva","8000");

        finalPage.FinishOrder();

    }
}
