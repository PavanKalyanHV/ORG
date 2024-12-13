package testCases;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pageObjectClass.LoginPage;
import testBase.BaseClass;

public class TC01_LoginPageTest extends BaseClass {
	
	@Test(groups={"Regression","Sanity"})
	public void verify_login(){
		System.out.print("Started test execution");
		logger.info("*****Starting the test Case TC01_LoginPageTest *****");
		try {
		LoginPage lp = new LoginPage(driver);
		logger.info("Enter User Name");
		lp.enterUserName(p.getProperty("userName"));
		logger.info("Enter Password");
		lp.enterUserPassword(p.getProperty("password"));
		logger.info("Click login button");
		lp.clickLoginButton();
		boolean value = lp.verifyIfLoggedIn();
		Assert.assertEquals(value, true);
		}
		catch(Exception e){
			logger.error("Test Failed");
			logger.debug("Debug logs...");
			Assert.fail();
		}
	}
}
