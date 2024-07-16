package StepDefination;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class bookkartresistration 
{
	Utils util;
	
	public bookkartresistration (Utils util)
	
	{
     this.util=util;
	}
	

	@When("user enter all required details and resister successfully")
	public void user_enter_all_required_details_and_resister_successfully() throws InterruptedException 
	
	{
		       
		Random random = new Random();
        int randomNumber = random.nextInt(100);
		       
	      util.driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Jyoti"+randomNumber);
	    
	      util.driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Salunkhe"+randomNumber);
	      util.driver.findElement(By.xpath("//input[@placeholder='User name']")).sendKeys("jyoti"+randomNumber);
	     
	      
	      util.driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Jyoti@123324549");
	      util.driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Jyoti@123324549");
	      util.driver.findElement(By.xpath("//input[@type='radio' and @value='Female']")).click();
	      util.driver.findElement(By.xpath("//mat-label[text()='Confirm Password']")).click();
	     
	}
	
	
}
