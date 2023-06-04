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

    @Test(dataProvider = "uncorrectUsers")
    public void unsuccessfullLogin(String username, String password) {


    }
    @DataProvider(name = "uncorrectUsers")
    public Object[][] readUsersFromCsv() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/uncorrectUsers.csv"));
            List<String[]> csvDataUncorrectUsers = csvReader.readAll();
            Object[][] csvDataObj = new Object[csvDataUncorrectUsers.size()][2];

            for (int i = 0; i < csvDataUncorrectUsers.size(); i++) {
                csvDataObj[i] = csvDataUncorrectUsers.get(i);
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
