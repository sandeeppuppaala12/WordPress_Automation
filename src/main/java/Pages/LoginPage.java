package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseFrame.BaseFrame;

public class LoginPage extends BaseFrame {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	private By loginPageHeader = By.className("login__form-header");
	private By username_name = By.name("usernameOrEmail");
	private By password_id = By.id("password");
	private By loginValidationMessage = By.xpath("//div[@role='alert']");
	private By continueButton_xpath = By.xpath("//button[@type='submit']");
	private By changeUsername = By.className("login__form-change-username");
	private By createNewAccount_linkText = By.linkText("create a new account");

	public boolean isLoginPageHeaderVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(loginPageHeader);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public String getLoginPageHeaderTitle() {
		String title = "";
		try {
			title = getText(loginPageHeader);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return title;
	}

	public boolean isEmail_AddressFieldVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(username_name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isEmail_AddressFieldEditable() {
		boolean isEnabled = true;
		try {
			isEnabled = isElementEditable(username_name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public void enter_Email_Address(String email) {
		try {
			sendKeys(username_name, email);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isPasswordFieldVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(password_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isPasswordEditable() {
		boolean isEnabled = true;
		try {
			isEnabled = isElementEditable(password_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public void enter_Password(String password) {
		try {
			sendKeys(password_id, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isLoginValidationMessageVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(loginValidationMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public String getLoginValidationText() {
		String text = "";
		try {
			text = getText(loginValidationMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public boolean isContinueButtonVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(continueButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isContinueButtonEnabled() {
		boolean isEnabled = false;
		try {
			isEnabled = isElementEditable(continueButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public void click_ContinueButton() {
		try {
			clickElement(continueButton_xpath);
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isChangeUsernameButtonVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(changeUsername);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isChangeUsernameButtonEnabled() {
		boolean isEnabled = false;
		try {
			isEnabled = isElementEditable(changeUsername);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public void click_ChangeUsernameButton() {
		try {
			clickElement(changeUsername);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MyProfilePage validLoginProcess(String uname, String pwd) {
		try {
			enter_Email_Address(uname);
			click_ContinueButton();
			pwd = decryptCredentials(pwd);
			enter_Password(pwd);
			click_ContinueButton();
			waitForPageTitleChange("My Profile");
			return getInstance(MyProfilePage.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public CreateAccountPage clickCreateAccountLink() {
		try {
			clickElement(createNewAccount_linkText);
			return getInstance(CreateAccountPage.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
