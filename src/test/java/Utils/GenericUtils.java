package Utils;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class GenericUtils 
{
	public WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
public void SwitchWindowToChild()
{
	 ArrayList<String> list =new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(list.get(1));
}
}
