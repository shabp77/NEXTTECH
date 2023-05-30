package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Macyshandbags {
	
	WebDriver driver;
	@Given("^Users visit Macys home page$")
	public void users_visit_Macys_home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\polly\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	// how to open URL
		driver.get("https://www.macys.com/?lid=glbtopnav_macys_icon-us");
Thread.sleep(3000);
	    
	}
	  
	

	@When("^Users click on Macys Handbags$")
	public void users_click_on_Macys_Handbags() throws Throwable {
	 
	}

	@Then("^Users should direct to Macys Handbags page$")
	public void users_should_direct_to_Macys_Handbags_page() throws Throwable {
	   
	}

	
	

	
	
	  	}

	
	
