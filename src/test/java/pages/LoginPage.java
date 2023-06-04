package pages;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement getUsernameInput;

    @FindBy(id = "password")
    private WebElement PasswordInput;

    @FindBy(id = "login-button")
    private WebElement loginBtn;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void Login(String username, String password) {
        getUsernameInput.click();
        getUsernameInput.clear();
        getUsernameInput.sendKeys(username);

        PasswordInput.click();
        PasswordInput.clear();
        PasswordInput.sendKeys(password);

    }

    @DataProvider(name = "correctUsers")
    public Object[][] readUsersFromCsv() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/correctUsers.csv"));
            List<String[]> csvDataCorrectUsers = csvReader.readAll();
            Object [] [] csvDataObj = new Object[csvDataCorrectUsers.size()][2];
        } catch (IOException z) {
            System.out.println("It is not possible to find file!");
            return null;
        } catch (CsvException z) {
            return null;
        }
    }

