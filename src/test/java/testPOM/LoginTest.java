package testPOM;

import base.TestUtil;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends TestUtil {

    @Test(dataProvider = "correctUsers")
    public void successfulLogin(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("st, "secret_sauce");


    }


    }





