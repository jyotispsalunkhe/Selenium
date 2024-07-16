package StepDefination;

import java.io.IOException;
import java.sql.Driver;
import Utils.TestContextSetup;
import io.cucumber.java.After;

public class hooks 
{
	TestContextSetup testcontex;
	public hooks(TestContextSetup testcontex )
	{
		this.testcontex=testcontex;
	}
	
	
	@After
	public void closebrower() throws IOException
	{
    testcontex.testbase.WebDriverManager().quit();
	}

}
