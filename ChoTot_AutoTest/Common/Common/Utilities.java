package Common;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Utilities {
	
	public static String getProjectPath() {	
		return System.getProperty("user.dir");
	}

	public static String getURL() {
		return Constant.WEBDRIVER.getCurrentUrl();
	}
	
	public static boolean isElementDisapper(By by)
    {
        try
        {
            while (true)
            {
                try
                {
                    if (Constant.WEBDRIVER.findElement(by).isDisplayed())
                        Thread.sleep(2000);
                }
                catch (NoSuchElementException e)
                {
                    break;
                }
            }
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
        
        
    }
	

}
