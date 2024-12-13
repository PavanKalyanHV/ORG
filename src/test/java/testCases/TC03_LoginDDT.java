package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectClass.AdminPage;
import pageObjectClass.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC03_LoginDDT extends BaseClass{
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="Datadriven")
	public void verify_login(String username, String password, String expRes){
		System.out.print("Started test execution");
		logger.info("*****Starting the test Case TC03_LoginPageTestDDT *****");
		try {
			AdminPage ap = new AdminPage(driver);
			LoginPage lp = new LoginPage(driver);
			logger.info("Enter User Name");
			lp.enterUserName(username);
			logger.info("Enter Password");
			lp.enterUserPassword(password);
			logger.info("Click login button");
			lp.clickLoginButton();
			boolean value = lp.verifyIfLoggedIn();
			
			if(expRes.equalsIgnoreCase("valid")){
				logger.info("Valid Credentials");
				if(value==true){
					logger.info("valid = true");
					ap.clickProfile();
					ap.clickLogout();
					Assert.assertTrue(true);
				}
				else {
					Assert.fail();
				}
			}
			
			if(expRes.equalsIgnoreCase("invalid")){
				logger.info("Invalid Credentials");
				if(value==true){
					ap.clickProfile();
					ap.clickLogout();
					Assert.fail();
				}
				else {
					logger.info("valid = false");
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
}
