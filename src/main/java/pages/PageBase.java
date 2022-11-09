package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

    protected WebDriver driver;
    public Select select;
    public static  JavascriptExecutor jse ;

    public PageBase(WebDriver driver)
    {
      this.driver = driver;
    }
    
    protected static void click(WebDriver driver,By elementLocator) {
		driver.findElement(elementLocator).click();
	}
    
    protected static void clickUsingJs(WebDriver driver,By elementLocator) {
		WebElement element =  driver.findElement(elementLocator);
		jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element);
	}
 
    public void scrollToBottom() {
		jse.executeScript("scrollBy(0,300)");
	}
}
