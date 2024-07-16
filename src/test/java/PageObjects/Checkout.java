package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout 
{ 
	WebDriver driver;
	public Checkout(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By proceedtocheckout =By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By itemname = By.cssSelector("p.product-name");
	By placeorder=By.xpath("//button[text()='Place Order']");
	By AgreeCheckbox=By.cssSelector("input.chkAgree");
	By Proceed=By.xpath("//button[text()='Proceed']");
	
	public void ProceedToCheckout()
	{
		driver.findElement(proceedtocheckout).click();
	}
	public void Getitemnameoncheckoutpage()
	{
		driver.findElement(itemname).getText();
	}
	public void PlaceOrder()
	{
		driver.findElement(placeorder).click();
	}
	public void Proceedorder()
	{
		driver.findElement(AgreeCheckbox).click();
		driver.findElement(Proceed).click();
		
	}

}
