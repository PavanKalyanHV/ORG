package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePage{
	
	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='Admin']")
	WebElement btnAdmin;
	
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	WebElement searchUserName;
	
	@FindBy(xpath="(//div[contains(text(),'-- Select --')])[1]")
	WebElement dropUserRole;
	
	@FindBy(xpath="//div[contains(@class, 'oxd-select-option')]//span[contains(text(), 'Admin')]")
	WebElement optionAdmin;
	
	@FindBy(xpath="//div[contains(@class, 'oxd-select-option')]//span[contains(text(), 'ESS')]")
	WebElement optionEss;
	
	@FindBy(xpath="(//div[contains(text(),'-- Select --')])[2]")
	WebElement dropStatus;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement searchEmployeeName;
	
	@FindBy(xpath="//button[normalize-space()='Search']")
	WebElement btnSearch;
	
	@FindBy(xpath="//span[normalize-space()='Enabled']")
	WebElement optionEnabled;
	
	@FindBy(xpath="//span[normalize-space()='Disabled']")
	WebElement optionDisabled;
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	WebElement btnProfile;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement btnLogout;
	
	
	public void clickAdminButton() {
		btnAdmin.click();
	}

	public void enterUserNameToSearch(String usrName) {
		searchUserName.sendKeys(usrName);
	}
	
	public void clickUserRoleDropDown() {
		searchUserName.click();
	}
	
	public void selectUserRole(String userRole) {
		if(userRole == "Admin") {
			optionAdmin.click();
		}
		else if(userRole == "EsS") {
			optionEss.click();
		}
	}
	
	public void enterEmployeeName(String empName) {
		searchEmployeeName.sendKeys(empName);
	}
	
	public void clickStatusDropDown(){
		dropStatus.click();
	}
	
	public void selectStatus(String status) {
		if(status == "Enabled") {
			optionEnabled.click();
		}
		else if(status == "Disabled") {
			optionDisabled.click();
		}
	}
	
	public void clickSubmit() {
		btnSearch.click();
	}
	
	public void clickProfile() {
		btnProfile.click();
	}
	
	public void clickLogout() {
		btnLogout.click();
	}
}

