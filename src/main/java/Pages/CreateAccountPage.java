package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseFrame.BaseFrame;

public class CreateAccountPage extends BaseFrame {

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}
	
	private By emailAddress_name= By.name("email");
	private By username_id=  By.id("username");
	private By password_id=  By.id("password");
	private By createValidationMessage= By.xpath("//div[@role='alert']");
	private By createButton_xpath=  By.xpath("//button[@type='submit']");
	private By changeUsername_class= By.className("login__form-change-username");
	private By termsOfService_linkText= By.linkText("Terms of Service");
	
	
	

}
