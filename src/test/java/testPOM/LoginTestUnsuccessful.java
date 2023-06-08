package testPOM;

import base.TestUtil;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LoginTestUnsuccessful extends TestUtil {

    @Test(dataProvider = "incorrectUsers")
    public void unsuccessfullLogin(String username, String password) {


    }
    @DataProvider(name = "incorrectUsers")
    public Object[][] readUsersFromCsv() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/incorrectUsers.csv"));
            List<String[]> csvDataIncorrectUsers = csvReader.readAll();
            Object[][] csvDataObj = new Object[csvDataIncorrectUsers.size()][2];

            for (int i = 0; i < csvDataIncorrectUsers.size(); i++) {
                csvDataObj[i] = csvDataIncorrectUsers.get(i);
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
