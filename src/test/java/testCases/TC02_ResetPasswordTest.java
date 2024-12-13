package testCases;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pageObjectClass.LoginPage;
import testBase.BaseClass;

public class TC02_ResetPasswordTest extends BaseClass {
	
	@Test(groups= {"Regression","Sanity"})
	public void resetPassword() {
		
		LoginPage lp = new LoginPage(driver);
		
		logger.info("*****Starting the test Case TC02_ResetPasswordTest *****");
		
		try {
			logger.info("Cliked on the forgot password button");
			lp.clickForgetPasswordButton();
			
			logger.info("Enter username");
			lp.enterUserName("Admin");
			
			logger.info("Clicked on Reset Password button");
			lp.clickResetPasswordButton();
			
			logger.info("Verify if reset link is sent");
			Boolean value = lp.verifyIfResetLinkIsSent();
			Assert.assertEquals(value,true);
			
			logger.info("Resetn link is sent");
		}
		catch(Exception e){
			logger.error("Test Failed");
			logger.debug("Debug logs...");
			Assert.fail();
		}
	}

}
