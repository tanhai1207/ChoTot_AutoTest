package ChoTot;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest{
	
    @Test(description = "User can log into Chotot with valid username and password")
	public void TestCase1() {
		boolean loginButtonStatus = homePage.open().goToLoginPage().login(data.loginAccount).isLoginButtonDisplayed();
		Assert.assertEquals(loginButtonStatus, false, "User is not logged in as expected");	
	}

}
