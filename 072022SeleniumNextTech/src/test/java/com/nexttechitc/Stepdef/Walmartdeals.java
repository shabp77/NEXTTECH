package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Walmartdeals {
	
	WebDriver driver;
	

@Given("^User visit Walmart home page$")
public void user_visit_Walmart_home_page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\polly\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
// how to open URL
	driver.get("https://www.walmart.com/");
Thread.sleep(3000);
   
}

@When("^User clicks on Walmart deals$")
public void user_clicks_on_Walmart_deals() throws Throwable {
   
}

@Then("^user should be able to redirect to Walmart deals page$")
public void user_should_be_able_to_redirect_to_Walmart_deals_page() throws Throwable {
    
}

}
