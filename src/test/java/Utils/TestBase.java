package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream file =new FileInputStream( "//Users//jyotisalunkhe//eclipse-workspace//Selenium//src//test//resources//global.properties");
		Properties prop=new Properties();
	prop.load(file);
		String URL = prop.getProperty("QAURL");
		
		if (driver==null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			
			{
				
			driver= new ChromeDriver();
		
             driver.get(URL);
			}
			
			if  (prop.getProperty("browser").equalsIgnoreCase("edge"))
			{
				driver=new EdgeDriver();
				driver.get(URL);
			}
        }
        
        return driver;
        
	}
	

}
