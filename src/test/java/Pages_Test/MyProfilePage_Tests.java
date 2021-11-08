package Pages_Test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.MyProfilePage;

public class MyProfilePage_Tests extends TestFrame {

	@Parameters({ "uname", "pwd", "pageTitle" })
	@Test(description = "Validate MyProfile Page Title")
	public void validateMyProfilePageTitle(String uname, String pwd, String pageTitle) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		String title = profile.getPageTitle();
		Assert.assertEquals(title, pageTitle);

	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if First Name field is displayed")
	public void validateMyProfilePage_Components_Visibility_FirstName_Field(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isFirstNameFieldVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Last Name field is displayed")
	public void validateMyProfilePage_Components_Visibility_LastName_Field(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isLastNameFieldVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Display Name field is displayed")
	public void validateMyProfilePage_Components_Visibility_DisplayName_Field(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isDisplayNameFieldVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Description field is displayed")
	public void validateMyProfilePage_Components_Visibility_Description_Field(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isDescriptionFieldVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Change Photo link is Enabled ")
	public void validateMyProfilePage_Components_Visibility_ChangePhotoLink(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isChangePhotoLinkEnabled());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Popover Button is displayed")
	public void validateMyProfilePage_Components_Visibility_PopoverButton(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isPopover_ButtonVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Gravatar link is displayed after clicking Popover Button")
	public void validateMyProfilePage_Components_Visibility_GrAvatarLink(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_popover_button();
		Assert.assertTrue(profile.isGravatarLinkVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Save Details Button is displayed")
	public void validateMyProfilePage_Components_Visibility_SaveDetailsButton(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isSaveDetailsButtonVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Toggle Button is displayed")
	public void validateMyProfilePage_Components_Visibility_ToggleButton(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isToggleButtonVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Gravatar Profile Link is displayed")
	public void validateMyProfilePage_Components_Visibility_GravatarProfileLink(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isGravatarProfileLinkVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Gravatar Profile Delete Link is displayed")
	public void validateMyProfilePage_Components_Visibility_GravatarProfileDeleteLink(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isGravatarProfileLinkVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Add Profile Button is displayed")
	public void validateMyProfilePage_Components_Visibility_AddProfileButton(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isAddProfileLinkButtonVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Add Profile- Add Word Press Site button is displayed")
	public void validateMyProfilePage_Components_Visibility_AddProfile_AddWordPressSite_Button(String uname,
			String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isAddProfile_AddSiteButtonVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Add Profile- Add URL button is displayed")
	public void validateMyProfilePage_Components_Visibility_AddProfile_AddURL_Button(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isAddProfile_AddURLButtonVisible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Help button is displayed")
	public void validateMyProfilePage_Components_Visibility_HelpButton(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isHelpButtonVisible());
	}

	@Parameters({ "uname", "pwd", "firstNameLabel" })
	@Test(description = "Validate if First Name Label is as per the input provided")
	public void validateMyProfilePage_Components_Label_Text_FirstName(String uname, String pwd, String firstNameLabel) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertEquals(profile.getFirstNameLabelText(), firstNameLabel);
	}

	@Parameters({ "uname", "pwd", "lastNameLabel" })
	@Test(description = "Validate if Last Name Label is as per the input provided")
	public void validateMyProfilePage_Components_Label_Text_LastName(String uname, String pwd, String lastNameLabel) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertEquals(profile.getLastNameLabelText(), lastNameLabel);
	}

	@Parameters({ "uname", "pwd", "displayLabel" })
	@Test(description = "Validate if Display Name Label is as per the input provided")
	public void validateMyProfilePage_Components_Label_Text_DisplayName(String uname, String pwd, String displayLabel) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertEquals(profile.getDisplayNameLabelText(), displayLabel);
	}

	@Parameters({ "uname", "pwd", "descriptionLabel" })
	@Test(description = "Validate if Description Label is as per the input provided")
	public void validateMyProfilePage_Components_Label_Text_Description(String uname, String pwd,
			String descriptionLabel) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertEquals(profile.getDescriptionLabelText(), descriptionLabel);
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if First Name field is Editable")
	public void validateMyProfilePage_Components_Editable_FirstName_Field(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isFirstNameFieldEditable());
	}

	@Parameters({ "uname", "pwd", "firstNameText" })
	@Test(description = "Validate if First Name field displays First name as per the input provided")
	public void validateMyProfilePage_Components_FirstName_Field_Accepts_Values(String uname, String pwd,
			String firstNameText) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_FirstName(firstNameText);
		profile.click_SaveButton();
		Assert.assertEquals(profile.get_FirstName(), firstNameText);
	}

	@Parameters({ "uname", "pwd" })
	@Test
	public void validateMyProfilePage_Components_Editable_LastName_Field(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isLastNameFieldEditable());
	}

	@Parameters({ "uname", "pwd", "lastNameText" })
	@Test(description = "Validate if Last Name field displays First name as per the input provided")
	public void validateMyProfilePage_Components_LastName_Field_Accepts_Values(String uname, String pwd,
			String lastNameText) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_LastName(lastNameText);
		profile.click_SaveButton();
		Assert.assertEquals(profile.get_LastName(), lastNameText);
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Display Name field is Editable")
	public void validateMyProfilePage_Components_Editable_DisplayName_Field(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isDisplayNameFieldEditable());
	}

	@Parameters({ "uname", "pwd", "displayName" })
	@Test(description = "Validate if Display field displays display name as per the input provided")
	public void validateMyProfilePage_Components_Display_Field_Accepts_Values(String uname, String pwd,
			String displayName) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_DisplayName(displayName);
		profile.click_SaveButton();
		Assert.assertEquals(profile.get_DisplayName(), displayName);
	}

	@Parameters({ "uname", "pwd", "displayName" })
	@Test(description = "Validate if Display name can contain Special characters")
	public void validateMyProfilePage_Components_DisplayName_With_SpecialCharacters(String uname, String pwd,
			String displayName) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_DisplayName("@#$%&*");
		profile.click_SaveButton();
		Assert.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Description Field is Editable")
	public void validateMyProfilePage_Components_Editable_Description_Field(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.isDescriptionFieldEditable());
	}

	@Parameters({ "uname", "pwd", "description" })
	@Test(description = "Validate if Description field displays description as per the input provided")
	public void validateMyProfilePage_Components_Description_Field_Accepts_Values(String uname, String pwd,
			String description) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_description(description);
		profile.click_SaveButton();
		Assert.assertEquals(profile.get_Description(), description);
	}

	@Parameters({ "uname", "pwd", "photoChangeStatus" })
	@Test(description = "Validate if Profile photo status displays description as per the input provided")
	public void validateMyProfilePage_Components_PhotoStatus_Description_Message(String uname, String pwd,
			String photoChangeStatus) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertEquals(profile.get_ProfilePhotoStatus(), photoChangeStatus);
	}

	@Parameters({ "uname", "pwd", "gravatarLoginLink" })
	@Test(description = "Validate if Gravatar Login link is not broken")
	public void validateMyProfilePage_Links_GrAvatarLoginLink(String uname, String pwd, String gravatarLoginLink) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.grAvatarloginLinkProcess();
		String title = profile.getPageURL();
		Assert.assertEquals(title, gravatarLoginLink);
	}

	@Parameters({ "uname", "pwd", "gravatarProfileLink" })
	@Test(description = "Validate if Gravatar Profile link is not broken")
	public void validateMyProfilePage_Links_GrAvatarProfileLink(String uname, String pwd, String gravatarProfileLink) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.grAvatarProfileLinkProcess();
		String newURL = profile.getPageURL();
		Assert.assertEquals(newURL, gravatarProfileLink);
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Save details button is enabled without changing any default field values")
	public void validateMyProfilePage_SaveDetailsButton_Functionality_Default(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertFalse(profile.isSaveButtonEnabled());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Save details button is enabled by changing FirstName field with a Space")
	public void validateMyProfilePage_SaveDetailsButton_Functionality_AnyText_Field_Space(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_FirstName(" ");
		Assert.assertTrue(profile.isSaveButtonEnabled());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Save details button is enabled by changing FirstName field with a Text")
	public void validateMyProfilePage_SaveDetailsButton_Functionality_AnyText_Field_Text(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_FirstName("Hello");
		Assert.assertTrue(profile.isSaveButtonEnabled());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Save details button is enabled by changing Toggle Button")
	public void validateMyProfilePage_SaveDetailsButton_Functionality_Change_Toggle_Button(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_ToggleButton();
		Assert.assertTrue(profile.isSaveButtonEnabled());
	}

	@Parameters({ "uname", "pwd", "firstNameText" })
	@Test(description = "Validate if Save details button functionality by entering text in the First Name field")
	public void validateMyProfilePage_SaveDetailsButton_Functionality_Enter_FirstName(String uname, String pwd,
			String firstNameText) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.enter_FirstName(firstNameText);
		profile.click_SaveButton();
		Assert.assertTrue(profile.isSaveDetails_confirmationMessage_Visible());
	}

	@Parameters({ "uname", "pwd", "firstNameText" })
	@Test(description = "Validate if Save details are reflecting in the First Name field", 
		dependsOnMethods = "validateMyProfilePage_SaveDetailsButton_Functionality_Enter_FirstName")
	public void validateMyProfilePage_SaveDetailsButton_Functionality_Assert_Saved_Data(String uname, String pwd,
			String firstNameText) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		String txt = profile.get_FirstName();
		Assert.assertEquals(txt, firstNameText);
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate Profile Link- Add WordPress Site- Functionality ")
	public void validateMyProfilePage_ProfileLink_Add_WordPressSite_Functionality(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		String window1 = profile.getPageTitle();
		profile.addProfile_addWordPressSite();
		String window2 = profile.getPageTitle();
		Assert.assertNotEquals(window1, window2);
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Profile Link- Add URL- Add Site Button is Enabled without entering any values in the URL and Description")
	public void validateMyProfilePage_ProfileLink_Add_URL_AddSite_Button_isEnabled(String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		Assert.assertFalse(profile.isAddProfile_addURL_AddSiteButton_Enabled());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Profile Link- Add URL- Add Site Button is Enabled without adding '.com' in the URL and Description text")
	public void validateMyProfilePage_ProfileLink_Add_URL_AddSite_Button_isEnabled_With_Invalide_URL_Format(
			String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		profile.enter_AddProfile_addURL_url("Hello");
		profile.enter_AddProfile_addURL_desc("World");
		Assert.assertFalse(profile.isAddProfile_addURL_AddSiteButton_Enabled());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if Profile Link- Add URL- Add Site Button is Enabled without adding '.com' in the URL and Description text")
	public void validateMyProfilePage_ProfileLink_Add_URL_AddSite_Button_isEnabled_With_Valid_URL_Format_And_Description(
			String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		profile.enter_AddProfile_addURL_url("Hello.com");
		profile.enter_AddProfile_addURL_desc("World");
		Assert.assertTrue(profile.isAddProfile_addURL_AddSiteButton_Enabled());
	}

	@Parameters({ "uname", "pwd" })
	@Test(description = "Validate if No URL Text is Present before adding Profile Link- Add URL- Add Site")
	public void validateMyProfilePage_NoURLText_Visibility_Before_ProfileLink_Add_URL_AddSite_Functionality(
			String uname, String pwd) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		Assert.assertTrue(profile.noURL_Element_Visibility() && profile.getProfileLinkList_URLs().size() == 0);

	}

	@Parameters({ "uname", "pwd", "createSite_URL", "createSite_Desc" })
	@Test(description = "Validate Profile Link- Add URL- Add Site Button Functionality with Valid URL and Description text")
	public void validateMyProfilePage_ProfileLink_Add_URL_AddSite_Button_Functionality_With_Valid_URL_Format_And_Description(
			String uname, String pwd, String createSite_URL, String createSite_Desc) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		profile.enter_AddProfile_addURL_url(createSite_URL);
		profile.enter_AddProfile_addURL_desc(createSite_Desc);
		profile.click_AddProfile_addURL_AddSiteButton();
		List<String> urls = profile.getProfileLinkList_URLs();
		Assert.assertTrue(urls.contains(createSite_URL));
	}

	@Parameters({ "uname", "pwd", "createSite_URL", "createSite_Desc", "url_validationMessage" })
	@Test(description = "Validate Profile Link- Add URL- Add Site Button Functionality with existing data", 
		dependsOnMethods = "validateMyProfilePage_ProfileLink_Add_URL_AddSite_Button_Functionality_With_Valid_URL_Format_And_Description")
	public void validateMyProfilePage_ProfileLink_Add_URL_AddSite_Button_Functionality_With_ExistingData(String uname,
			String pwd, String createSite_URL, String createSite_Desc, String url_validationMessage) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		profile.click_AddProfile_addURL_Button();
		profile.enter_AddProfile_addURL_url(createSite_URL);
		profile.enter_AddProfile_addURL_desc(createSite_Desc);
		profile.click_AddProfile_addURL_AddSiteButton();
		String getMessage = profile.getSaveDetails_confirmationMessage();
		Assert.assertTrue(getMessage.contains(url_validationMessage));
	}

	@Parameters({ "uname", "pwd", "createSite_URL" })
	@Test(description = "Validate Add Profile Links- Delete URL Functionality", 
		dependsOnMethods = "validateMyProfilePage_ProfileLink_Add_URL_AddSite_Button_Functionality_With_Valid_URL_Format_And_Description")
	public void validateMyProfilePage_ProfileLink_Add_URL_AddedSite_Delete_Functionality(String uname, String pwd,
			String createSite_URL) {
		MyProfilePage profile = page.getInstance(LoginPage.class).validLoginProcess(uname, pwd);
		List<String> urls = profile.getProfileLinkList_URLs();
		if (urls.contains(createSite_URL)) {
			profile.delete_AddProfile_URL(createSite_URL);
			List<String> newURLS = profile.getProfileLinkList_URLs();
			Assert.assertFalse(newURLS.contains(createSite_URL));
		}

	}

}
