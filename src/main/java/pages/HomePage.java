package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor) driver;
    }

//    @FindBy(id="fromPlaceName")
//    WebElement fromPlaceNameTxtField;
//
//    @FindBy(id="toPlaceName")
//    WebElement toPlaceNameTxtField;

//    public void setFromANDToPlaceName(String fromPlace, String toPlace) {
//
//        fromPlaceNameTxtField.sendKeys(fromPlace);
//        toPlaceNameTxtField.sendKeys(toPlace);
//    }

    @FindBy(xpath = "//div[@class='carousel-inner']//a[@class='carousel-control-next']")
    WebElement routeSlider;

    @FindBy(xpath = "//li//a[contains(.,' Chikkamagaluru - Bengaluru')]")
    WebElement routeLink;

    @FindBy(xpath = "//td[3]//a[@class='ui-state-default']")
    WebElement arrivalDate;

    //
    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block btn-booking']")
    WebElement searchForBusBtn;
    
    public By searchBtnLocator = By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']");

    @FindBy(id = "corover-close-btn")
    WebElement closepopupBtn;

    public void selectPopularRouteAndDate() throws InterruptedException {

        routeSlider.click();
        Thread.sleep(2000);
        routeLink.click();
        arrivalDate.click();

    }

    public void clickSearchBtn(WebDriver driver) {     
    	click(driver, searchBtnLocator);
    }
    
    public void clickSearchBtnUsingJs(WebDriver driver) {     
    	clickUsingJs(driver, searchBtnLocator);
    }

}