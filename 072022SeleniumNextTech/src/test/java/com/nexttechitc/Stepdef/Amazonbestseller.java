package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.bestsellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonbestseller {
	
	WebDriver driver;
	

@Given("^User visits amazon home page$")
public void user_visits_amazon_home_page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\polly\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
// how to open URL
	driver.get("https://www.amazon.com/ref=nav_logo");
Thread.sleep(3000);
//maximize the window
driver.manage().window().maximize();
}

@When("^User clicks on amazon bestseller$")
public void user_clicks_on_amazon_bestseller() throws Throwable {
	
	bestsellerPOM bestseller=new bestsellerPOM(driver);
	bestseller.bestseller().click();
	
    
}

@Then("^User will be redirect to bestseller page$")
public void user_will_be_redirect_to_bestseller_page() throws Throwable {
	
	
}  

}
