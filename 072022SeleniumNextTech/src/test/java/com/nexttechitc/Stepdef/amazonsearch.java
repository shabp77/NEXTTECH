package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.amazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class amazonsearch {
	
	WebDriver driver;
	
	@Given("^user visit Amazon home page$")
	public void user_visit_Amazon_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\polly\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		   driver = new ChromeDriver();
		  
	// how to open URL
		driver.get("https://www.amazon.com/ref=nav_logo");
  Thread.sleep(3000);
	    
	}
	@When("^user type \"([^\"]*)\" and click seach icon$")
	public void user_type_and_click_seach_icon(String arg1) throws Throwable {
	amazonsearchPOM search=new  amazonsearchPOM(driver);
	search.amazonsearch1().sendKeys(arg1);
	
	search.searchicon().click();
	}

	@Then("^user should be able to see the expected product$")
	public void user_should_be_able_to_see_the_expected_product() throws Throwable {
	   
	}

}
