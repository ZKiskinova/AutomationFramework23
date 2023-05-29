package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DocuWarePage extends BasePage{

    @FindBy(id="dw-webClientContent")
    private WebElement taskBtn;


    public DocuWarePage(WebDriver driver) {
        super(driver);

    }

    public DocTasksPage setTaskBtn(WebElement taskBtn) {
        this.taskBtn = taskBtn;
        taskBtn.click();
        return new DocTasksPage(driver);
    }

}

