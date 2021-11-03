package BaseFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page_Abstraction {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	public Page_Abstraction(WebDriver driver) {
		this.driver= driver;
		this.wait= new WebDriverWait(this.driver, 10);
		
	}
	
	//Creating common abstract methods
	
	public abstract String getText(By locator);
	public abstract void clickElement(By locator);
	public abstract void selectText(By locator, String text);
	public abstract String getPageTitle();
	public abstract WebElement getElement(By locator);
	public abstract List<WebElement> getElements(By locator);
	public abstract void expliciteWait(String condition, By locator);
	public abstract void sendKeys(By locator, String text);
	public abstract boolean isElementDisplayed(By locator);
	public abstract boolean isElementEditable(By locator);
	public abstract String getAttribute(By locator,String attributeName);
	public abstract void switchWindow(String winTitle);
	public abstract void waitForPageTitleChange(String title);
	public abstract void switchToActiveWindow();
	public abstract String getPageURL();
	public abstract By getElement(String xpath);
	public abstract String[] splitString(String text, String splitConstant);
	
	//Used to create new instance of a passed class using WebDriver
	public <PageClass extends BaseFrame> PageClass getInstance(Class<PageClass> pClass) {
		try {
			return pClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}


}
