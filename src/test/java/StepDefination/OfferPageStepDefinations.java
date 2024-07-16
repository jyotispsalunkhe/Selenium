package StepDefination;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OffersPage;
import PageObjects.PageObjectManager;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;

public class OfferPageStepDefinations 
{
	TestContextSetup testcontex;
	String offerpageproductname;
	PageObjectManager pageobject;
	
	
	public OfferPageStepDefinations(TestContextSetup testcontex)
	{
		this.testcontex=testcontex;
		
	}
	@Then("^usersearched for (.+) shortname in offer page$")
	public void usersearched_for_shortname_in_offer_page(String string) throws InterruptedException 
	{
		LandingPage landingpage = testcontex.pageobject.GetLandingPage();
		landingpage.SelectTopDealsPage();
        Thread.sleep(2000);
		SwitchtoOffersPage();
		
		OffersPage offerpage = testcontex.pageobject.GetOffersPage();
		offerpage.GetSearchText(string);
		testcontex.offerpageproductname=offerpage.GetProductName();
	}
	public void SwitchtoOffersPage()
	{
		
		testcontex.genericutils.SwitchWindowToChild();
	   // ArrayList<String> list =new ArrayList<String>(testcontex.driver.getWindowHandles());
	   // testcontex.driver.switchTo().window(list.get(1));
	}
	
	@Then("validate product name in offers page matching with lading page")
	public void validate_product_name_in_offers_page_matching_with_lading_page() throws InterruptedException 
	{
		 
	    Thread.sleep(2000);
	    
	  
	    Assert.assertEquals(testcontex.LandingPageProductName,testcontex.offerpageproductname);
	}
}
