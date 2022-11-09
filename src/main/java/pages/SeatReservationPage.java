package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SeatReservationPage extends PageBase {

    public SeatReservationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="Forward-1467550949362")
    WebElement boardingPointSelect;

    @FindBy(id = "Forwarddroping-tab")
    WebElement droppingPointTab;

    @FindBy(id = "Forward-1467467616730")
    WebElement droppingPointSelect;

    @FindBy(id = "mobileNo")
    WebElement mobileNumField; //Customer

    @FindBy(id = "email")
    WebElement emailIDField; //Customer

    @FindBy(id = "Forward16")
    WebElement seatNumberSelect;

    //passenger details
    @FindBy(xpath = "//a[contains(.,'Passenger Details')]")
    WebElement expandPassengerDetails;

    @FindBy(id = "passengerNameForward0")
    WebElement passengerNameField;

    @FindBy(id = "genderCodeIdForward0")
    WebElement passengerGenderDDL;

    @FindBy(id = "passengerAgeForward0")
    WebElement passengerAgeField;

    @FindBy(id = "concessionIdsForward0")
    WebElement passengerConcessionDDLll;

    @FindBy(id = "SrvcSelectBtnForward0")
    WebElement selectSeatBtn;

    @FindBy(id = "PgBtn")
    WebElement makePaymentBtn;

    public void selectSeat()
    {
        selectSeatBtn.click();
        seatNumberSelect.click();
    }

    public void selectPoints()
    {
        boardingPointSelect.click();
        //droppingPointTab.click();
        droppingPointSelect.click();
    }

    public void enterCustomerInfo(String mobileNum, String Email)
    {
        mobileNumField.sendKeys(mobileNum);
        emailIDField.sendKeys(Email);
    }

    public void enterPassengerDetails(String passengerName, String passengerGender, String passengerAge)
    {
        selectSeatBtn.click();

        expandPassengerDetails.click();

        passengerNameField.sendKeys(passengerName);

        select = new Select(passengerGenderDDL);
        select.selectByVisibleText(passengerGender);

        passengerAgeField.sendKeys(passengerAge);

        select = new Select(passengerConcessionDDLll);
        select.selectByIndex(0);

    }

    public void submitPayment(){
        makePaymentBtn.click();
    }


}
