package Pages_Test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.MyProfilePage;

public class MyProfilePage_Tests extends TestFrame {
	
	@Parameters({"uname","pwd","pageTitle"})
	@Test
	public void validateMyProfilePageTitle(String uname, String pwd, String pageTitle) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		String title= profile.getPageTitle();
		Assert.assertEquals(title,pageTitle);
		
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Visibility_FirstName_Field(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isFirstNameFieldVisible());
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Visibility_LastName_Field(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isLastNameFieldVisible());
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Visibility_DisplayName_Field(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isDisplayNameFieldVisible());
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Visibility_Description_Field(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isDescriptionFieldVisible());
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Visibility_SaveDetailsButton(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isSaveDetailsButtonVisible());
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Visibility_ToggleButton(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isToggleButtonVisible());
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Visibility_GravatarProfileLink(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isGravatarProfileLinkVisible());
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Visibility_GravatarProfileDeleteLink(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isGravatarProfileLinkVisible());
	}
	
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Visibility_AddProfileButton(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isAddProfileLinkButtonVisible());
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Visibility_AddProfile_AddWordPressSite_Button(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isAddProfile_AddSiteButtonVisible());
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Visibility_AddProfile_AddURL_Button(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isAddProfile_AddURLButtonVisible());
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Visibility_HelpButton(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isHelpButtonVisible());
	}
	
	@Parameters({"uname","pwd","firstNameLabel"})
	@Test
	public void validateMyProfilePage_Components_Label_Text_FirstName(String uname, String pwd, String firstNameLabel) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertEquals(profile.getFirstNameLabelText(),firstNameLabel);
	}
	
	@Parameters({"uname","pwd","lastNameLabel"})
	@Test
	public void validateMyProfilePage_Components_Label_Text_LastName(String uname, String pwd, String lastNameLabel) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertEquals(profile.getLastNameLabelText(),lastNameLabel);
	}
	
	@Parameters({"uname","pwd","displayLabel"})
	@Test
	public void validateMyProfilePage_Components_Label_Text_DisplayName(String uname, String pwd, String displayLabel) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertEquals(profile.getDisplayNameLabelText(),displayLabel);
	}
	
	@Parameters({"uname","pwd","descriptionLabel"})
	@Test
	public void validateMyProfilePage_Components_Label_Text_Description(String uname, String pwd, String descriptionLabel) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertEquals(profile.getDescriptionLabelText(),descriptionLabel);
	}
	
	@Parameters({"uname","pwd","displayName"})
	@Test
	public void validateMyProfilePage_Components_DisplayName(String uname, String pwd, String displayName) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertEquals(profile.get_DisplayName(),displayName);
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Editable_FirstName_Field(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isFirstNameFieldEditable());
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Editable_LastName_Field(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isLastNameFieldEditable());
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Editable_DisplayName_Field(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isDisplayNameFieldEditable());
	}
	
	@Parameters({"uname","pwd"})
	@Test
	public void validateMyProfilePage_Components_Editable_Description_Field(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isDescriptionFieldEditable());
	}
	
	@Parameters({"uname","pwd","gravatarLoginLink"})
	@Test
	public void validateMyProfilePage_Links_GrAvatarLoginLink(String uname, String pwd,String gravatarLoginLink) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.grAvatarloginLinkProcess();
		String title= profile.getPageURL();
		Assert.assertEquals(title,gravatarLoginLink);
	}
	
	@Parameters({"uname","pwd","gravatarProfileLink"})
	@Test
	public void validateMyProfilePage_Links_GrAvatarProfileLink(String uname, String pwd, String gravatarProfileLink) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		String dpName= profile.get_DisplayName();
		System.out.println("Display Name: "+dpName);
		profile.grAvatarProfileLinkProcess();
		String newURL= profile.getPageURL();
		String expected= gravatarProfileLink+dpName;
		System.out.println("Expected: "+expected);
		Assert.assertEquals(newURL,expected);
	}
	
	@Parameters({"uname","pwd"})
	@Test(description="Validate if Save details button is enabled without changing any default field values")
	public void validateMyProfilePage_SaveDetailsButton_Functionality_Default(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertFalse(profile.isSaveButtonEnabled());
	}
	
	@Parameters({"uname","pwd"})
	@Test(description="Validate if Save details button is enabled by changing FirstName field with a Space")
	public void validateMyProfilePage_SaveDetailsButton_Functionality_AnyText_Field_Space(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_FirstName(" ");
		Assert.assertTrue(profile.isSaveButtonEnabled());
	}
	
	@Parameters({"uname","pwd"})
	@Test(description="Validate if Save details button is enabled by changing FirstName field with a Text")
	public void validateMyProfilePage_SaveDetailsButton_Functionality_AnyText_Field_Text(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_FirstName("Hello");
		Assert.assertTrue(profile.isSaveButtonEnabled());
	}
	
	@Parameters({"uname","pwd"})
	@Test(description="Validate if Save details button is enabled by changing Toggle Button")
	public void validateMyProfilePage_SaveDetailsButton_Functionality_Change_Toggle_Button(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_ToggleButton();
		Assert.assertTrue(profile.isSaveButtonEnabled());
	}
	
	
	@Parameters({"uname","pwd","firstNameText"})
	@Test(description="Validate if Save details button functionality by entering text in the First Name field")
	public void validateMyProfilePage_SaveDetailsButton_Functionality_Enter_FirstName(String uname, String pwd, String firstNameText) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_FirstName(firstNameText);
		profile.click_SaveButton();
		System.out.println("Get Text: "+profile.getSaveDetails_confirmationMessage());
		Assert.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
	}
	
	@Parameters({"uname","pwd","firstNameText"})
	@Test(description="Validate if Save details are reflecting in the First Name field",dependsOnMethods="validateMyProfilePage_SaveDetailsButton_Functionality_Enter_FirstName")
	public void validateMyProfilePage_SaveDetailsButton_Functionality_Assert_Saved_Data(String uname, String pwd, String firstNameText) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		String txt= profile.get_FirstName();
		System.out.println("Get Text: "+txt);
		Assert.assertEquals(txt,firstNameText);
	}
	
	@Parameters({"uname","pwd"})
	@Test(description="Validate Profile Link- Add WordPress Site- Functionality ")
	public void validateMyProfilePage_ProfileLink_Add_WordPressSite_Functionality(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		String window1= profile.getPageTitle();
		profile.addProfile_addWordPressSite();
		String window2= profile.getPageTitle();
		Assert.assertNotEquals(window1, window2);
	}
	
	@Parameters({"uname","pwd"})
	@Test(description="Validate if Profile Link- Add URL- Add Site Button is Enabled without entering any values in the URL and Description")
	public void validateMyProfilePage_ProfileLink_Add_URL_AddSite_Button_isEnabled(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		Assert.assertFalse(profile.isAddProfile_addURL_AddSiteButton_Enabled());
	}
	
	@Parameters({"uname","pwd"})
	@Test(description="Validate if Profile Link- Add URL- Add Site Button is Enabled without adding '.com' in the URL and Description text")
	public void validateMyProfilePage_ProfileLink_Add_URL_AddSite_Button_isEnabled_With_Invalide_URL_Format(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		profile.enter_AddProfile_addURL_url("Hello");
		profile.enter_AddProfile_addURL_desc("World");
		Assert.assertFalse(profile.isAddProfile_addURL_AddSiteButton_Enabled());
	}
	
	@Parameters({"uname","pwd"})
	@Test(description="Validate if Profile Link- Add URL- Add Site Button is Enabled without adding '.com' in the URL and Description text")
	public void validateMyProfilePage_ProfileLink_Add_URL_AddSite_Button_isEnabled_With_Valid_URL_Format_And_Description(String uname, String pwd) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		profile.enter_AddProfile_addURL_url("Hello.com");
		profile.enter_AddProfile_addURL_desc("World");
		Assert.assertTrue(profile.isAddProfile_addURL_AddSiteButton_Enabled());
	}
	
	@Parameters({"uname","pwd","createSite_URL","createSite_Desc"})
	@Test(description="Validate if Profile Link- Add URL- Add Site Button Functionality with Valid URL and Description text")
	public void validateMyProfilePage_ProfileLink_Add_URL_AddSite_Button_Functionality_With_Valid_URL_Format_And_Description(String uname, String pwd,
			String createSite_URL, String createSite_Desc) {
		MyProfilePage profile= page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		profile.enter_AddProfile_addURL_url(createSite_URL);
		profile.enter_AddProfile_addURL_desc(createSite_Desc);
		profile.click_AddProfile_addURL_AddSiteButton();
		List<String> urls= profile.getProfileLinkList_URLs();
		for(String ur:urls) {
			if(ur.equalsIgnoreCase(createSite_URL)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
	}
	
	

}
