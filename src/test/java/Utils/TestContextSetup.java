package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetup 
{
	public WebDriver driver;
	public String LandingPageProductName;
	public PageObjectManager pageobject;
	public TestBase testbase;
	public GenericUtils genericutils;
	public String offerpageproductname;
	
	public TestContextSetup () throws IOException
	{
		 testbase = new TestBase();
		 genericutils =new GenericUtils(testbase.WebDriverManager());
	 pageobject=new PageObjectManager(testbase.WebDriverManager());
	
		
	}
	
	

}
