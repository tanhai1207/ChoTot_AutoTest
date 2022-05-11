package ChoTot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Constant.Constant;
import Common.Utilities;
import Data.Data;

public class BaseTest {	
	
	protected Data data = new Data();
	protected HomePage homePage = new HomePage();
	protected LoginPage loginPage = new LoginPage();
	protected GeneralPage generalPage = new GeneralPage();

	
	@BeforeMethod()
	public void beforeMethod() {
		System.out.println("Pre-condition");
		System.setProperty("webdriver.chrome.driver", Utilities.getProjectPath() + "\\Executables\\chromedriver.exe");
		Constant.WEBDRIVER = new ChromeDriver();
		Constant.WEBDRIVER.manage().window().maximize();

	}
	
	@AfterMethod()
	public void afterMethod() {
		System.out.println("Post-condition");
		Constant.WEBDRIVER.quit();
	}
	
	
}	
