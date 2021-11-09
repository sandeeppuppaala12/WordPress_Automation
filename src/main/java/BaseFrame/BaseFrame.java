package BaseFrame;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class BaseFrame extends Page_Abstraction {

	public BaseFrame(WebDriver driver) {
		super(driver);

	}

	@Override
	public String getPageTitle() {
		try {
			return driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getPageURL() {
		try {
			return driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebElement getElement(By locator) {
		try {
			expliciteWait("visibility", locator);
			return driver.findElement(locator);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public By getElement(String xpath) {
		try {
			return By.xpath(xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void expliciteWait(String condition, By locator) {
		try {
			if (condition.contains("presence"))
				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			else if (condition.contains("visiblity"))
				wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			else if (condition.contains("visiblityAll"))
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			else if (condition.contains("clickable"))
				wait.until(ExpectedConditions.elementToBeClickable(locator));
			else if (condition.contains("invisibility"))
				wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getText(By locator) {
		String txt = "";
		try {
			expliciteWait("visibility", locator);
			txt = driver.findElement(locator).getText().trim();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return txt;
	}

	@Override
	public void clickElement(By locator) {
		try {
			expliciteWait("visibility", locator);
			driver.findElement(locator).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void selectText(By locator, String text) {
		try {
			Select select = new Select(getElement(locator));
			if (text.contains("text")) {
				select.selectByVisibleText(text);
			} else if (text.contains("value")) {
				select.selectByValue(text);
				;
			} else {
				select.selectByIndex(Integer.parseInt(text));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<WebElement> getElements(By locator) {
		try {
			expliciteWait("visibilityAll", locator);
			return driver.findElements(locator);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<String> getListFromElements(By locator) {
		List<String> list = new ArrayList<String>();
		try {
			expliciteWait("visibility", locator);
			for (WebElement ele : driver.findElements(locator)) {
				list.add(ele.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void sendKeys(By locator, String text) {
		try {
			getElement(locator).clear();
			getElement(locator).sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean isElementDisplayed(By locator) {
		boolean isVisible = true;
		try {
			isVisible = getElement(locator).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	@Override
	public boolean isElementEditable(By locator) {
		boolean isEnabled = true;
		try {
			expliciteWait("visibility", locator);
			isEnabled = getElement(locator).isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	@Override
	public String getAttribute(By locator, String attributeName) {
		String attributeValue = "";
		try {
			attributeValue = getElement(locator).getAttribute(attributeName).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return attributeValue;
	}

	@Override
	public void switchWindow(String winTitle) {
		try {
			for (String win : getWindowHandles()) {
				if (win.contains(winTitle)) {
					driver.switchTo().window(win);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void waitForPageTitleChange(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void switchToActiveWindow() {
		try {
			driver.switchTo().activeElement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getWindowHandle() {
		String wind = "";
		try {
			wind = driver.getWindowHandle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wind;
	}

	public Set<String> getWindowHandles() {
		Set<String> windows = null;
		try {
			windows = driver.getWindowHandles();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return windows;
	}

	@Override
	public String[] splitString(String text, String splitConstant) {
		try {
			String[] strArray = text.split(splitConstant);
			return strArray;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String decryptCredentials(String creds) {
		try {
			byte[] decodeBytes = Base64.getDecoder().decode(creds);
			String enco = new String(decodeBytes);
			return enco;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
