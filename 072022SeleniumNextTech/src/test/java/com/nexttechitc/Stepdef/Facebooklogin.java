package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooklogin {
	
	WebDriver driver;
	
	@Given("^User visits facebook home page$")
	public void user_visits_facebook_home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\polly\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	// how to open URL
		driver.get("https://www.facebook.com/");
    Thread.sleep(3000);
	    
	}

	@When("^User clicks on login$")
	public void user_clicks_on_login() throws Throwable {
	   
	}

	@Then("^User redirect to facebook login page$")
	public void user_redirect_to_facebook_login_page() throws Throwable {
	   
	}
}
