package Pages_Test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.LoginPage;
import Pages.MyProfilePage;

public class MyProfilePage_Tests extends TestFrame {

	@Parameters({ "uname", "pwd", "pageTitle" })
	@Test(description = "Validate MyProfile Page Title", priority = 1)
	public void myProfilePageTitle(String uname, String pwd, String pageTitle) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		String title = profile.getPageTitle();
		Assert.assertEquals(title, pageTitle);
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if all the fields on the Page are  displayed", priority = 2)
	public void myProfilePage_AllComponents_Visibility(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(profile.isFirstNameFieldVisible());
		soft.assertTrue(profile.isLastNameFieldVisible());
		soft.assertTrue(profile.isDisplayNameFieldVisible());
		soft.assertTrue(profile.isDescriptionFieldVisible());
		soft.assertAll();
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Change Photo link is Enabled ")
	public void myProfile_ChangePhotoLink_Enabled(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isChangePhotoLinkEnabled());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Gravatar link is displayed after clicking Popover Button")
	public void myProfile_GrAvatarLink_Visibility(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_popover_button();
		Assert.assertTrue(profile.isGravatarLinkVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if All Buttons are displayed on the Page", priority = 3)
	public void myProfile_AllButtons_Visiblity(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(profile.isPopover_ButtonVisible());
		soft.assertTrue(profile.isSaveDetailsButtonVisible());
		soft.assertFalse(profile.isToggleButtonVisible());
		soft.assertTrue(profile.isAddProfileLinkButtonVisible());
		soft.assertTrue(profile.isAddProfile_AddSiteButtonVisible());
		soft.assertTrue(profile.isAddProfile_AddURLButtonVisible());
		soft.assertTrue(profile.isHelpButtonVisible());
		soft.assertAll();
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Toggle Button is Selected")
	public void myProfile_Components_ToggleButton_Selection(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertFalse(profile.isToggleButtonChecked());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Gravatar Profile and Delete Links is displayed")
	public void myProfile_Gravatar_Profile_Delete_Links(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(profile.isGravatarProfileLinkVisible());
		soft.assertTrue(profile.isGravatarProfileDeleteLinkVisible());
		soft.assertAll();
	}

	@Parameters({ "uname", "pwd", "firstNameText" })
	@Test(description = "Validate if First Name field displays First name as per the input provided")
	public void myProfile_FirstName_Functionality(String uname, String pwd, String firstNameText) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_FirstName(firstNameText);
		profile.click_SaveButton();
		Assert.assertEquals(profile.get_FirstName(), firstNameText);
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if First Name field can have Blank values, Numbers & Special Characters")
	public void myProfile_FirstName_Validation(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_FirstName(" ");
		profile.click_SaveButton();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
		profile.enter_FirstName("12345");
		profile.click_SaveButton();
		soft.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
		profile.enter_FirstName("@#$");
		profile.click_SaveButton();
		soft.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
		soft.assertAll();
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Last Name field can have Blank values, Numbers & Special Characters")
	public void myProfile_LastName_Validation(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_LastName(" ");
		profile.click_SaveButton();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
		profile.enter_LastName("12345");
		profile.click_SaveButton();
		soft.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
		profile.enter_LastName("@#$");
		profile.click_SaveButton();
		soft.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
		soft.assertAll();
	}

	@Parameters({ "uname", "pwd", "lastNameText" })
	@Test(description = "Validate if Last Name field displays First name as per the input provided")
	public void myProfile_LastName_Functionality(String uname, String pwd, String lastNameText) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_LastName(lastNameText);
		profile.click_SaveButton();
		Assert.assertEquals(profile.get_LastName(), lastNameText);
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Display Name field is Editable")
	public void myProfile_DisplayName_IsEditable(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isDisplayNameFieldEditable());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Display Name field can have Blank values, Numbers & Special Characters")
	public void myProfile_DisplayName_Validation(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_DisplayName(" ");
		profile.click_SaveButton();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
		profile.enter_DisplayName("12345");
		profile.click_SaveButton();
		soft.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
		profile.enter_DisplayName("@#$");
		profile.click_SaveButton();
		soft.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
		soft.assertAll();
	}

	@Parameters({ "uname", "pwd", "displayName" })
	@Test(description = "Validate if Display field displays display name as per the input provided")
	public void myProfile_DisplayName_Functionality(String uname, String pwd, String displayName) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_DisplayName(displayName);
		profile.click_SaveButton();
		Assert.assertEquals(profile.get_DisplayName(), displayName);
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Description Field is Editable")
	public void myProfile_Description_IsEditable(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isDescriptionFieldEditable());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Description field can have Blank values, Numbers & Special Characters")
	public void myProfile_Description_Validation(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_description(" ");
		profile.click_SaveButton();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
		profile.enter_description("12345");
		profile.click_SaveButton();
		soft.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
		profile.enter_description("@#$");
		profile.click_SaveButton();
		soft.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
		soft.assertAll();
	}

	@Parameters({ "uname", "pwd", "description" })
	@Test(description = "Validate if Description field displays description as per the input provided")
	public void myProfile_Description_Functionality(String uname, String pwd, String description) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_description(description);
		profile.click_SaveButton();
		Assert.assertEquals(profile.get_Description(), description);
	}

	@Parameters({ "uname", "pwd", "firstNameLabel", "lastNameLabel", "displayLabel", "descriptionLabel" })
	@Test(description = "Validate all Label are as per the provided format")
	public void myProfilePage_Labels_Validation(String uname, String pwd, String firstNameLabel, String lastNameLabel,
			String displayLabel, String descriptionLabel) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(profile.getFirstNameLabelText(), firstNameLabel);
		soft.assertEquals(profile.getLastNameLabelText(), lastNameLabel);
		soft.assertEquals(profile.getDisplayNameLabelText(), displayLabel);
		soft.assertEquals(profile.getDescriptionLabelText(), descriptionLabel);
		soft.assertAll();
	}

	@Parameters({ "uname", "pwd", "photoChangeStatus" })
	@Test(description = "Validate if Profile photo status displays description as per the input provided")
	public void myProfile_PhotoStatus_Description(String uname, String pwd, String photoChangeStatus) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertEquals(profile.get_ProfilePhotoStatus(), photoChangeStatus);
	}

	@Parameters({ "uname", "pwd", "gravatarLoginLink" })
	@Test(description = "Validate if Gravatar Login link is not broken")
	public void myProfile_Links_GrAvatarLoginLink(String uname, String pwd, String gravatarLoginLink) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.grAvatarloginLinkProcess();
		String title = profile.getPageURL();
		Assert.assertEquals(title, gravatarLoginLink);
	}

	@Parameters({ "uname", "pwd", "gravatarProfileLink" })
	@Test(description = "Validate if Gravatar Profile link is not broken")
	public void myProfile_Links_GrAvatarProfileLink(String uname, String pwd, String gravatarProfileLink) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.grAvatarProfileLinkProcess();
		String newURL = profile.getPageURL();
		Assert.assertEquals(newURL, gravatarProfileLink);
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Save details button is enabled without changing any default field values")
	public void myProfile_SaveDetailsButton_Functionality_Default(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertFalse(profile.isSaveButtonEnabled());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Save details button is enabled by changing FirstName field with a Text")
	public void myProfile_SaveDetailsButton_Functionality(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_FirstName("Hello");
		Assert.assertTrue(profile.isSaveButtonEnabled());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Save details button is enabled by changing Toggle Button")
	public void myProfile_SaveDetailsButton_with_Toggle(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_ToggleButton();
		Assert.assertTrue(profile.isSaveButtonEnabled());
	}

	@Parameters({ "uname", "pwd", "firstNameText" })
	@Test(description = "Validate if Save confirmation Message is displayed")
	public void myProfile_SaveDetailsButton_Functionality(String uname, String pwd, String firstNameText) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_FirstName(firstNameText);
		profile.click_SaveButton();
		Assert.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate Profile Link- Add WordPress Site- Functionality ")
	public void myProfile_ProfileLink_Add_WordPressSite_Functionality(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		String window1 = profile.getPageTitle();
		profile.addProfile_addWordPressSite();
		String window2 = profile.getPageTitle();
		Assert.assertNotEquals(window1, window2);
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Profile Link- Add URL- Add Site Button is Enabled without entering any values in the URL and Description")
	public void myProfile_ProfileLink_AddSite_Button_isEnabled(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		Assert.assertFalse(profile.isAddProfile_addURL_AddSiteButton_Enabled());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Profile Link- Add URL- Add Site Button is Enabled without adding '.com' in the URL and Description text")
	public void myProfile_ProfileLink_AddSite_Functionality_InvalidFormat(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		profile.enter_AddProfile_addURL_url("Hello");
		profile.enter_AddProfile_addURL_desc("World");
		Assert.assertFalse(profile.isAddProfile_addURL_AddSiteButton_Enabled());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Profile Link- Add URL- Add Site Button is Enabled by adding '.com' in the URL and Description text")
	public void myProfile_ProfileLink_AddSite_Button_Functionality(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		profile.enter_AddProfile_addURL_url("Hello.com");
		profile.enter_AddProfile_addURL_desc("World");
		Assert.assertTrue(profile.isAddProfile_addURL_AddSiteButton_Enabled());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if No URL Text is Present before adding Profile Link- Add URL- Add Site", priority = 4)
	public void myProfile_AddSite_Functionality_WithoutData(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.noURL_Element_Visibility() && profile.getProfileLinkList_URLs().size() == 0);

	}

	@Parameters({ "uname", "pwd", "createSite_URL", "createSite_Desc" })
	@Test(description = "Validate Profile Link- Add URL- Add Site Button Functionality with Valid URL and Description text", priority = 5)
	public void myProfile_ProfileLink_AddSite_Functionality(String uname, String pwd, String createSite_URL,
			String createSite_Desc) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		profile.enter_AddProfile_addURL_url(createSite_URL);
		profile.enter_AddProfile_addURL_desc(createSite_Desc);
		profile.click_AddProfile_addURL_AddSiteButton();
		List<String> urls = profile.getProfileLinkList_URLs();
		Assert.assertTrue(urls.contains(createSite_URL));
	}

	@Parameters({ "uname", "pwd", "createSite_URL", "createSite_Desc", "url_validationMessage" })
	@Test(description = "Validate Profile Link- Add URL- Add Site Button Functionality with existing data", dependsOnMethods = "myProfile_ProfileLink_AddSite_Functionality", priority = 6)
	public void myProfile_ProfileLink_AddSite_With_ExistingData(String uname, String pwd, String createSite_URL,
			String createSite_Desc, String url_validationMessage) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		profile.enter_AddProfile_addURL_url(createSite_URL);
		profile.enter_AddProfile_addURL_desc(createSite_Desc);
		profile.click_AddProfile_addURL_AddSiteButton();
		String getMessage = profile.getSaveDetails_confirmationMessage();
		Assert.assertTrue(getMessage.contains(url_validationMessage));
	}

	@Parameters({ "uname", "pwd", "createSite_URL" })
	@Test(description = "Validate Add Profile Links- Delete URL Functionality", dependsOnMethods = "myProfile_ProfileLink_AddSite_Functionality", priority = 7)
	public void myProfile_ProfileLink_DeleteSite_Functionality(String uname, String pwd, String createSite_URL) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		List<String> urls = profile.getProfileLinkList_URLs();
		if (urls.contains(createSite_URL)) {
			profile.delete_AddProfile_URL(createSite_URL);
			List<String> newURLS = profile.getProfileLinkList_URLs();
			Assert.assertFalse(newURLS.contains(createSite_URL));
		}

	}

}
