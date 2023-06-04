package testPOM;

import base.TestUtil;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LoginTestSuccessful extends TestUtil {


    @Test(dataProvider = "correctUsers")
    public void Login(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);

    }
    @DataProvider(name = "correctUsers")
    public Object[][] readUsersFromCsv() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/correctUsers.csv"));
            List<String[]> csvDataCorrectUsers = csvReader.readAll();
            Object[][] csvDataObj = new Object[csvDataCorrectUsers.size()][2];

            for (int i = 0; i < csvDataCorrectUsers.size(); i++) {
                csvDataObj[i] = csvDataCorrectUsers.get(i);
            }
            return csvDataObj;

        } catch (IOException e) {
            System.out.println("It is not possible to find file!");
            return null;
        } catch (CsvException e) {
            return null;
        }
    }


    }





