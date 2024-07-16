package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.PageObjectManager;
import Utils.TestContextSetup;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageStepDefinations
{
    TestContextSetup testcontex;
	PageObjectManager pageobject;
	public LandingPageStepDefinations(TestContextSetup testcontex)
	{
		this.testcontex=testcontex;
	}
	
	@Given("User is on greenkart landing page")
	public void user_is_on_greenkart_landing_page() throws InterruptedException, IOException 
{
		 testcontex.testbase.WebDriverManager();
	    Thread.sleep(2000);
	}
	
	@When("^User searched with short name (.+) and extracted actual name of product$")
	public void user_searched_with_short_name_and_extracted_actual_name_of_product(String shortname) throws InterruptedException 
	{
		
	
		LandingPage landingpage = testcontex.pageobject.GetLandingPage();
		
		landingpage.GetSearchText(shortname);
		Thread.sleep(2000);
		testcontex.LandingPageProductName  = landingpage.GetProductName().split("-")[0].trim();
		
        
	}
	
	@When("user added {int} items of the selected product to the cart")
	public void user_added_items_of_the_selected_product_to_the_cart(Integer int1) 
	{
		testcontex.pageobject.landingpage.AddItemToCart();
	}
	
	
	

}
