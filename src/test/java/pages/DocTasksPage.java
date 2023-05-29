package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DocTasksPage extends BasePage {


    public DocTasksPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

}
