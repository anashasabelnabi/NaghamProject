package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBusPage extends PageBase {

    public SearchBusPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "SrvcSelectBtnForward0")
    WebElement selectSeatBtn;


    public void selectSeat() {
        selectSeatBtn.click();
    }
}
