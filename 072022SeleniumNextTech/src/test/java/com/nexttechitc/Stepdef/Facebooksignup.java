package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.pageobjectmodel.FacebooksignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooksignup { 
	
	
	
	WebDriver driver;
	@Given("^user visit Facebook signup page$")
	public void user_visit_Facebook_signup_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\polly\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	// how to open URL
		driver.get("https://www.facebook.com/signup");
	Thread.sleep(3000);
	//maximize the window
	driver.manage().window().maximize();
	  
	}

	@When("^user type \"([^\"]*)\" and type \"([^\"]*)\" and type \"([^\"]*)\" and retype \"([^\"]*)\" type \"([^\"]*)\"$")
	public void user_type_and_type_and_type_and_retype_type(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		FacebooksignupPOM obj=new FacebooksignupPOM(driver);
		
		obj.firstname().sendKeys(arg1);
		obj.lastname().sendKeys(arg2);
		obj.email().sendKeys(arg3);
		obj.reemail().sendKeys(arg4);
		obj.password().sendKeys(arg5);
		
	}

	@When("^user select month  and select day and select year$")
	public void user_select_month_and_select_day_and_select_year() throws Throwable {
		FacebooksignupPOM obj1=new FacebooksignupPOM(driver);
		Select month =new Select(obj1.Click_month);
		month.selectByIndex(0);
		Thread.sleep(3000);
		Select day =new Select(obj1.Click_day);
		day.selectByValue("7");
		Thread.sleep(3000);
		Select year=new Select(obj1.Click_year);
		year.deselectByVisibleText("1977");
		Thread.sleep(3000);
		
		
	}

	@When("^user select gender female$")
	public void user_select_gender_female() throws Throwable {
		FacebooksignupPOM obj2=new FacebooksignupPOM(driver);
		  
	   
	}

	@When("^click  on signup button$")
	public void click_on_signup_button() throws Throwable {
		FacebooksignupPOM obj3=new FacebooksignupPOM(driver);
		obj3.click_signup.click();
	   
	}

	@Then("^user will be able signup Facebook$")
	public void user_will_be_able_signup_Facebook() throws Throwable {
	   
	}

   


   
}
	
	
			
		
		

		
		

		
		
	
	
	
	
	
	




