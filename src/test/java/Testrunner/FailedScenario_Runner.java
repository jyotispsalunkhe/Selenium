package Testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_scenario",glue="StepDefination",
monochrome=true,
tags="@regression",
plugin= {"html:target/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class FailedScenario_Runner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel=true)
public Object[][] scenarios()
{
	return super.scenarios();
	
}
}
