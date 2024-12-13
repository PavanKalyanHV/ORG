package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnLogin;
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	WebElement txtProfileName;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement btnForgotPasswrod;
	
	@FindBy(xpath="//button[normalize-space()='Reset Password']")
	WebElement btnResetPassword;
	
	@FindBy(xpath="//h6[normalize-space()='Reset Password link sent successfully']")
	WebElement txtResetPasswordSuccessful;
	
	public void enterUserName(String userName){
		txtUserName.sendKeys(userName);
	}
	
	public void enterUserPassword(String pswrd){
		txtPassword.sendKeys(pswrd);
	}
	
	public void clickLoginButton() {
		btnLogin.click();
	}
	
	public boolean verifyIfLoggedIn() {
		return txtProfileName.isDisplayed();
	}
	
	public void clickForgetPasswordButton() {
		 btnForgotPasswrod.click();
	}
	
	public void clickResetPasswordButton() {
		btnResetPassword.click();
	}
	
	public boolean verifyIfResetLinkIsSent() {
		return txtResetPasswordSuccessful.isDisplayed();
	}
}
	
	
