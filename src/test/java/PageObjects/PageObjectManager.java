package PageObjects;

import org.openqa.selenium.WebDriver;



public class PageObjectManager 
{
	WebDriver driver;
	public LandingPage landingpage;
	public OffersPage offerpage;
	
	
	public PageObjectManager (WebDriver driver)
	{
		this.driver=driver;
	}

	public LandingPage GetLandingPage()
	{
		 landingpage=new LandingPage(driver);
		 return landingpage;
	}
	
	public OffersPage GetOffersPage()
	{
	 offerpage=new OffersPage(driver);
	 return offerpage;
	}
	public Checkout getchechoutpage()
	{
		Checkout checkoutpage = new Checkout(driver);
		return checkoutpage;
		
	}
	
	
}
