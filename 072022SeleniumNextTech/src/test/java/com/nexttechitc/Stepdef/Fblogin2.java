package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.Fblogin2POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fblogin2 {

	WebDriver driver;
	
	@Given("^User visit Facebook home page$")
	public void user_visit_Facebook_home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\polly\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	// how to open URL
		driver.get("https://www.facebook.com/login/");
	Thread.sleep(3000);
	//maximize the window
	driver.manage().window().maximize();
	   
	}

	@When("^User type valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void user_type_valid_and_valid(String arg1, String arg2) throws Throwable {
		Fblogin2POM obj=new Fblogin2POM(driver);
		obj.email().sendKeys(arg1);
		obj.password().sendKeys(arg2);
	   
	}

	@Then("^User should be direct to Facebook account page$")
	public void user_should_be_direct_to_Facebook_account_page() throws Throwable {
			   
	}
}
