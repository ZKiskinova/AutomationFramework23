package testPOM;

import base.TestUtil;
import org.testng.annotations.Test;
import pages.DocuWarePage;
import pages.LoginPage;

public class LoginTest extends TestUtil {

    @Test
    public void successfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        DocuWarePage Page = loginPage.login("Златина Колева","77777777");
    }

}
