package tests;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomeTest extends BaseTests {

    HomePage homePage;    
    @Test
    public void userCanEnterFromANDToPlace() throws InterruptedException {

        homePage = new HomePage(driver);
        homePage.scrollToBottom();
        homePage.selectPopularRouteAndDate();
    }

    @Test(dependsOnMethods="userCanEnterFromANDToPlace")
    public void userCanClickOnSearchBus() throws InterruptedException {
        homePage = new HomePage(driver);
        //homePage.scrollToBottom();
        WebDriverWait wait = new WebDriverWait(driver,120);             
        wait.until(ExpectedConditions.elementToBeClickable(homePage.searchBtnLocator));
        homePage.clickSearchBtnUsingJs(driver);
       }

}
