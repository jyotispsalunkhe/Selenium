package StepDefination;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bookcart {
	Utils util;
	
	public bookcart(Utils util)
	{
		this.util=util;
	}
	 public WebDriver driver;
	@Given("user is on login page1")
	public void user_is_on_login_page1() throws InterruptedException 
	{
	    util.driver=new ChromeDriver();
	    util.driver.get("https://bookcart.azurewebsites.net/login");
	    Thread.sleep(2000);
	    
	}
	@When("user navigate to resistration page")
	public void user_navigate_to_resistration_page() throws InterruptedException 
	{
	    util.driver.findElement(By.xpath("//span[text()='Register']")).click();
//	    ArrayList<String> list =new ArrayList<String>(driver.getWindowHandles());
//	   driver.switchTo().window(list.get(1));
//	   Thread.sleep(4000);
	}
	@When("user again login to page")
	public void user_again_login_to_page() 
	{
	    
	    
	}
	@Then("user verify the user")
	public void user_verify_the_user() 
	{
	    
	}


}
