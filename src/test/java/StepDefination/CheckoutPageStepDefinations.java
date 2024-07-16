package StepDefination;

import Utils.TestContextSetup;
import io.cucumber.java.en.Then;

public class CheckoutPageStepDefinations 

{
	TestContextSetup testcontex;
	public CheckoutPageStepDefinations(TestContextSetup testcontex)
	{
		this.testcontex=testcontex;
	}
	@Then("user proceed to checkout and validate the Tom items in checkout page")
	public void user_proceed_to_checkout_and_validate_the_tom_items_in_checkout_page() throws InterruptedException 
	{
		testcontex.pageobject.GetLandingPage().Clickaddtocart();
		testcontex.pageobject.GetLandingPage().AddItemToCart();
		testcontex.pageobject.GetLandingPage().CartOnLandingPage();
		Thread.sleep(2000);
		testcontex.pageobject.getchechoutpage().ProceedToCheckout();
		Thread.sleep(2000);
		
		
	}
	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() throws InterruptedException 
	{
	    testcontex.pageobject.getchechoutpage().PlaceOrder();
	    testcontex.pageobject.getchechoutpage().Proceedorder();
	    
	    
	    Thread.sleep(4000);
	}
	
}
