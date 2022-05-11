package ChoTot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Account.Account;
import Constant.Constant;

public class LoginPage extends GeneralPage {
	
	private final By txtUserName = By.xpath("//input[@type='tel']");
	private final By txtPassWord = By.xpath("//input[@type='password']");
	private final By btnLogin = By.xpath("//button[@type='submit']");

	protected WebElement getTxtUserName() {return Constant.WEBDRIVER.findElement(txtUserName);}
	protected WebElement getTxtPassWord() {return Constant.WEBDRIVER.findElement(txtPassWord);}
	protected WebElement getBtnLogin() {return Constant.WEBDRIVER.findElement(btnLogin);}

	public HomePage login(Account account) {
		getTxtUserName().sendKeys(account.getUsername());
		getTxtPassWord().sendKeys(account.getPassword());
		getBtnLogin().click();
		return new HomePage();
	}
	
}
