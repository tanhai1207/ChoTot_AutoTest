package ChoTot;


import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.Utilities;
import Constant.Constant;

public class GeneralPage {
	
	private final By btnLogin = By.xpath("//span[@class='show-desktop suuviek']//b[text()='Đăng nhập']");
	
	protected WebElement getBtnLogin() {return Constant.WEBDRIVER.findElement(btnLogin);}
	
	public HomePage open() {
		Constant.WEBDRIVER.navigate().to(Constant.CHOTOT_URL);
		return new HomePage();
	}
	
	public LoginPage goToLoginPage() {
		this.getBtnLogin().click();
		return new LoginPage();
	}
	
	public boolean isLoginButtonDisplayed() {
		try{
				Utilities.isElementDisapper(btnLogin);;
					return false;
		}catch (NoSuchElementException e)
			{
				return true;
			}
			
	}
}
