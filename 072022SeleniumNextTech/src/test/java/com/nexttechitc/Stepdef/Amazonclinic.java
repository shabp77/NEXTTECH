package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonclinic {
	
	WebDriver driver;
	@Given("^User visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\polly\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	// how to open URL
		driver.get("https://www.amazon.com/");
    Thread.sleep(3000);
	}

@When("^user clicks on amazon clinic$")
	public void user_clicks_on_amazon_clinic() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User should be able to redirect to amazon clinic$")
	public void user_should_be_able_to_redirect_to_amazon_clinic() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
