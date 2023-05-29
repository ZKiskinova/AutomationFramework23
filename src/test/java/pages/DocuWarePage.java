package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocuWarePage extends BasePage{

    @FindBy(id="dw-webClientContent")
     WebElement taskBtn;


    public DocuWarePage(WebDriver driver) {
        super(driver);
       PageFactory.initElements(driver,this);

    }

    public DocTasksPage clickTask() {
        taskBtn.click();
        return new DocTasksPage(driver);
    }
}

