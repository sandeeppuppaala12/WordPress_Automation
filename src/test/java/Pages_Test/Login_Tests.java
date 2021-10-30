package Pages_Test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class Login_Tests extends TestFrame {
	
	
	
	@Parameters({"uname","pwd","invalidUserMessage"})
	@Test
	public void validate_Invalid_Username_Validation_Message(String uname, String pwd, String invalidUserMessage) {
		page.getInstance(LoginPage.class).enter_Email_Address(uname);
		page.getInstance(LoginPage.class).click_ContinueButton();
		String message= page.getInstance(LoginPage.class).getLoginValidationText();
		System.out.println("Validation Message: "+message);
		Assert.assertEquals(message, invalidUserMessage);
	}
	
	@Parameters({"uname","pwd","invalidPassMessage"})
	@Test
	public void validate_Invalid_Password_Validation_Message(String uname, String pwd,String invalidPassMessage) {
		page.getInstance(LoginPage.class).enter_Email_Address("sandeep.puppaala@gmail.com");
		page.getInstance(LoginPage.class).click_ContinueButton();
		page.getInstance(LoginPage.class).enter_Password("abc");
		page.getInstance(LoginPage.class).click_ContinueButton();
		String message= page.getInstance(LoginPage.class).getLoginValidationText();
		System.out.println("Validation Message: "+message);
		Assert.assertEquals(message, invalidPassMessage);
		
	}
	

}
