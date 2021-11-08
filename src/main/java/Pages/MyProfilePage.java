package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseFrame.BaseFrame;

public class MyProfilePage extends BaseFrame {

	public MyProfilePage(WebDriver driver) {
		super(driver);
	}

	/* Locators */

	private By pageHeader = By.xpath("//h1");
	private By sideBarMenuItems = By.xpath("//ul[@class='sidebar__menu']/li");
	private By firstName = By.id("first_name");
	private By lastName = By.id("last_name");
	private By displayName = By.id("display_name");
	private By description = By.id("description");
	private By toggleButton = By.id("inspector-toggle-control-0");
	private By gRavatar_Link = By.linkText("Gravatar");
	private By photo_popover = By.className("popover__inner");
	private By popover_button_xpath = By.xpath("//*[@id=\"primary\"]/main/div[2]/div/div[2]/button");
	private By gRavatarProfile_Link = By.linkText("Gravatar profile");
	private By gRavatarProfileDelete_Link = By.linkText("Gravatar.com");
	private By addProfileLink = By.xpath("//div[@class='section-header__actions']//span");
	private By addProfile_tooltip_Options = By.xpath("//div[@role='menu']/button");
	private By addProfile_Options_CreateSite_CreateButton_xpath = By.xpath("//button[contains(text(),'Create Site')]");
	private By addProfile_Options_CancelButton_xpath = By.xpath("//button[contains(text(),'Cancel')]");
	private By addProfile_Options_AddURL_URLField_name = By.name("value");
	private By addProfile_Options_AddURL_URLDescr_name = By.name("title");
	private By addProfile_Options_AddURL_AddSiteButton_xpath = By.xpath("//button[contains(text(),'Add Site')]");
	private By helpButton = By.xpath("//div[@class='inline-help']/button");
	private By help_Menu_Links = By.xpath("li[@class='inline-help__results-item']//a");
	private By logoutButton_xpath = By.xpath("//button[@title='Log out of WordPress.com']");
	private By saveDetailsButton_xpath = By.xpath("//button[contains(text(),'Save profile details')]");
	private By changePhotoLink_class = By.className("edit-gravatar__label");
	private By photoProfileStatus_class = By.className("edit-gravatar__explanation");
	private By profileLinkList_URLs_xpath = By
			.xpath("//ul[@class='profile-links__list']/li/a/span[@class='profile-link__url']");
	private By profileLinkList_Descs_xpath = By
			.xpath("//ul[@class='profile-links__list']/li/a/span[@class='profile-link__title']");
	private By profileLinkList_CommonPath_xpath = By.xpath("//ul[@class='profile-links__list']/li");

	private By noURLLinks_class = By.className("profile-links__no-links");

	private By firstName_label = By.xpath("//label[@for='first_name']");
	private By lastName_label = By.xpath("//label[@for='last_name']");
	private By displayName_label = By.xpath("//label[@for='display_name']");
	private By description_label = By.xpath("//label[@for='description']");

	private By saveConfirmation_class = By.className("notice__text");

	public boolean isPageHeaderVisible() {
		boolean isVisible = false;
		try {
			expliciteWait("visibility", pageHeader);
			isVisible = isElementDisplayed(pageHeader);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public String getPageHeader() {
		String header = "";
		try {
			header = getText(pageHeader);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return header;
	}

	public List<String> getSideBarMenuItems() {
		List<String> menuList = new ArrayList<String>();
		try {
			List<WebElement> elements = getElements(sideBarMenuItems);
			for (WebElement ele : elements) {
				menuList.add(ele.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menuList;
	}

	public boolean isFirstNameFieldVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(firstName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isFirstNameFieldEditable() {
		boolean isEnabled = true;
		try {
			isEnabled = isElementEditable(firstName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public void enter_FirstName(String fName) {
		try {
			sendKeys(firstName, fName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String get_FirstName() {
		String fName = "";
		try {
			fName = getAttribute(firstName, "value");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return fName;
	}

	public boolean isLastNameFieldVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(lastName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isLastNameFieldEditable() {
		boolean isEnabled = true;
		try {
			isEnabled = isElementEditable(lastName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public void enter_LastName(String lName) {
		try {
			sendKeys(lastName, lName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String get_LastName() {
		String lName = "";
		try {
			lName = getAttribute(lastName, "value");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lName;
	}

	public boolean isDisplayNameFieldVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(displayName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isDisplayNameFieldEditable() {
		boolean isEnabled = true;
		try {
			isEnabled = isElementEditable(displayName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public void enter_DisplayName(String dName) {
		try {
			sendKeys(displayName, dName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String get_DisplayName() {
		String dName = "";
		try {
//			dName= getText(displayName);
			dName = getAttribute(displayName, "value");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dName;
	}

	public boolean isDescriptionFieldVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(lastName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isDescriptionFieldEditable() {
		boolean isEnabled = true;
		try {
			isEnabled = isElementEditable(lastName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public void enter_description(String desc) {
		try {
			sendKeys(description, desc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String get_Description() {
		String lName = "";
		try {
			lName = getAttribute(description, "value");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lName;
	}

	public boolean isChangePhotoLinkEnabled() {
		boolean isEnabled = false;
		try {
			isEnabled = isElementEditable(changePhotoLink_class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public String get_ProfilePhotoStatus() {
		String lName = "";
		try {
			lName = getText(photoProfileStatus_class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lName;
	}

	public boolean isPopover_ButtonVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(popover_button_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public void click_popover_button() {
		try {
			clickElement(popover_button_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isPopover_Visible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(photo_popover);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isSaveButtonVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(saveDetailsButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isSaveButtonEnabled() {
		boolean isEnabled = false;
		try {
			isEnabled = isElementEditable(saveDetailsButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public void click_SaveButton() {
		try {
			clickElement(saveDetailsButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isAddProfileLinkButtonVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(addProfileLink);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isAddProfileLinkButtonEnabled() {
		boolean isEnabled = false;
		try {
			isEnabled = isElementEditable(addProfileLink);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public void click_AddProfileLinkButton() {
		try {
			clickElement(addProfileLink);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<String> getAddLinkOptions() {
		List<String> options = new ArrayList<String>();
		try {
			List<WebElement> optionButtons = getElements(addProfile_tooltip_Options);
			for (WebElement ele : optionButtons) {
				if (ele.isEnabled())
					options.add(ele.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return options;
	}

	public boolean isSaveDetailsButtonVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(saveDetailsButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isSaveDetailsButtonEnabled() {
		boolean isEnabled = false;
		try {
			isEnabled = isElementEditable(saveDetailsButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public boolean isToggleButtonVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(toggleButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isToggleButtonEnabled() {
		boolean isEnabled = false;
		try {
			isEnabled = isElementEditable(toggleButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public boolean isGravatarLinkVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(gRavatar_Link);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isGravatarProfileLinkVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(gRavatarProfile_Link);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isGravatarProfileLinkEnabled() {
		boolean isEnabled = false;
		try {
			isEnabled = isElementEditable(gRavatarProfile_Link);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public boolean isGravatarProfileDeleteLinkVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(gRavatarProfileDelete_Link);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isGravatarProfileDeleteLinkEnabled() {
		boolean isEnabled = false;
		try {
			isEnabled = isElementEditable(gRavatarProfileDelete_Link);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public WebElement getWebElementFromList(By locator, String elementText) {
		WebElement element = null;
		List<WebElement> options;
		try {
			options = getElements(locator);
			for (WebElement ele : options) {
				if (ele.getText().toLowerCase().equalsIgnoreCase(elementText.toLowerCase())) {
					element = ele;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	public boolean isAddProfile_AddSiteButtonVisible() {
		boolean isVisible = true;
		try {
			click_AddProfileLinkButton();
			WebElement ele = getWebElementFromList(addProfile_tooltip_Options, "Add WordPress Site");
			isVisible = ele.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isAddProfile_AddURLButtonVisible() {
		boolean isVisible = true;
		try {
			click_AddProfileLinkButton();
			WebElement ele = getWebElementFromList(addProfile_tooltip_Options, "Add URL");
			isVisible = ele.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public void addProfile_addWordPressSite() {
		try {
			click_AddProfileLinkButton();
			WebElement ele = getWebElementFromList(addProfile_tooltip_Options, "Add WordPress Site");
			ele.click();
			String handle = getWindowHandle();
			clickElement(addProfile_Options_CreateSite_CreateButton_xpath);
			for (String winHand : getWindowHandles()) {
				if (!winHand.contains(handle)) {
					switchWindow(winHand);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
//		return null;

	}

	public void click_AddProfile_addURL_Button() {
		try {
			click_AddProfileLinkButton();
			WebElement ele = getWebElementFromList(addProfile_tooltip_Options, "Add URL");
			ele.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_AddProfile_addURL_AddSiteButton() {
		try {
			clickElement(addProfile_Options_AddURL_AddSiteButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isAddProfile_addURL_AddSiteButton_Visible() {
		boolean isVisible = true;
		try {
			isVisible = isElementDisplayed(addProfile_Options_AddURL_AddSiteButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isAddProfile_addURL_AddSiteButton_Enabled() {
		boolean isEnabled = true;
		try {
			isEnabled = isElementEditable(addProfile_Options_AddURL_AddSiteButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public boolean isAddProfile_addURL_CancelButton_Visible() {
		boolean isVisible = true;
		try {
			isVisible = isElementDisplayed(addProfile_Options_CancelButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isAddProfile_addURL_CancelButton_Enabled() {
		boolean isEnabled = true;
		try {
			isEnabled = isElementEditable(addProfile_Options_CancelButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public void enter_AddProfile_addURL_url(String url) {
		try {
			sendKeys(addProfile_Options_AddURL_URLField_name, url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enter_AddProfile_addURL_desc(String desc) {
		try {
			sendKeys(addProfile_Options_AddURL_URLDescr_name, desc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isHelpButtonVisible() {
		boolean isVisible = true;
		try {
			isVisible = isElementDisplayed(helpButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public void click_HelpButton() {
		try {
			clickElement(helpButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<String> getHelpMenuLinks() {
		return getListFromElements(help_Menu_Links);
	}

	public String getFirstNameLabelText() {
		String label = "";
		try {
			label = getText(firstName_label);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return label;
	}

	public String getLastNameLabelText() {
		String label = "";
		try {
			label = getText(lastName_label);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return label;
	}

	public String getDisplayNameLabelText() {
		String label = "";
		try {
			label = getText(displayName_label);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return label;
	}

	public String getDescriptionLabelText() {
		String label = "";
		try {
			label = getText(description_label);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return label;
	}

	public boolean isLogoutButtonVisible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(logoutButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public boolean isLogoutButtonEnabled() {
		boolean isEnabled = false;
		try {
			isEnabled = isElementEditable(logoutButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEnabled;
	}

	public void click_LogoutButton() {
		try {
			clickElement(logoutButton_xpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickGrAvatarProfileLink() {
		try {
			clickElement(gRavatarProfile_Link);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickGrAvatarloginLink() {
		try {
			clickElement(gRavatarProfileDelete_Link);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void grAvatarloginLinkProcess() {
		try {
			String parentWin = getWindowHandle();
			clickGrAvatarloginLink();
			for (String win : getWindowHandles()) {
				if (!win.contains(parentWin)) {
					switchWindow(win);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void grAvatarProfileLinkProcess() {
		try {
			String parentWin = getWindowHandle();
			clickGrAvatarProfileLink();
			for (String win : getWindowHandles()) {
				if (!win.contains(parentWin)) {
					switchWindow(win);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isSaveDetails_confirmationMessage_Visible() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(saveConfirmation_class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public String getSaveDetails_confirmationMessage() {
		String mess = "";
		try {
			mess = getText(saveConfirmation_class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mess;
	}

	public void click_ToggleButton() {
		try {
			WebElement tog = getElement(toggleButton);
			if (tog.isSelected()) {
				tog.click();
			} else {
				tog.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<String> getProfileLinkList_URLs() {
		List<String> links = new ArrayList<String>();
		try {
			for (WebElement ele : getElements(profileLinkList_URLs_xpath)) {
				links.add(ele.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return links;
	}

	public List<String> getProfileLinkList_Descps() {
		List<String> links = new ArrayList<String>();
		try {
			for (WebElement ele : getElements(profileLinkList_Descs_xpath)) {
				links.add(ele.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return links;
	}

	public boolean noURL_Element_Visibility() {
		boolean isVisible = false;
		try {
			isVisible = isElementDisplayed(noURLLinks_class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isVisible;
	}

	public void delete_AddProfile_URL(String deleteURL) {
		try {
			int count = 1;
			for (WebElement element : getElements(profileLinkList_CommonPath_xpath)) {
				String split = element.toString();
				String path = splitString(split, "-> xpath: ")[1];
				path = path.substring(0, path.length() - 1) + "[" + Integer.toString(count) + "]";

				String urlString = path.concat("/a/span[@class='profile-link__url']");
				String deleteString = path.concat("/button");
				WebElement newElement = getElement(By.xpath(urlString));
				if (newElement.getText().equalsIgnoreCase(deleteURL)) {
					WebElement newElementDelete = getElement(By.xpath(deleteString));
					newElementDelete.click();
					break;
				}
				count += 1;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
