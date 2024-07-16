package StepDefination;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	
	@Given("user is on login")
	public void user_is_on_login() 
	{
	    System.out.println("login successfully");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	
	@When("user enter {string}")
	public void user_enter_username(String username) 
	{
	   
	}
	@When("user enter {string} with no repeated character")
	public void user_enter_password_with_no_repeated_character(String password) {
	    
	}
	@Then("user should able to open dashboard")
	public void user_should_able_to_open_dashboard() {
	    
	}
	
	
	
	
	
		
	}



