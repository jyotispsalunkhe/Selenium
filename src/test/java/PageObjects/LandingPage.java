package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage 
{
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By Search=By.xpath("//input[@type='search']");
	By gettext=By.cssSelector("h4.product-name");
	
	By Topdealslink=By.xpath("//a[text()='Top Deals']");
	By additems=By.xpath("//a[@class='increment']");
	By AddToCart=By.xpath("//button[text()='ADD TO CART']");
	By cart= By.xpath("//img[@alt='Cart']");

	public void GetSearchText(String name)
	{
		driver.findElement(Search).sendKeys(name);
	}
	
	public void Clickaddtocart()
	{
		driver.findElement(AddToCart).click();
	}
	 public void CartOnLandingPage()
	 {
		 driver.findElement(cart).click();
	 }

public String GetProductName()
{
	return driver.findElement(gettext).getText();
	
	
}
public void SelectTopDealsPage()
{
	driver.findElement(Topdealslink).click();
	
}

public void AddItemToCart()
  {
	
	driver.findElement(additems).click();
	driver.findElement(additems).click();
	driver.findElement(additems).click();
	
	}
	}




