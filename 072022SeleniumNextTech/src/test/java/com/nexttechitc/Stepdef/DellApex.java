package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.pageobjectmodel.DellApexPOM;
import com.nexttechitc.pageobjectmodel.JcpennyTrendingPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DellApex {
	
	WebDriver driver;
	

@Given("^user visit Dell home page$")
public void user_visit_Dell_home_page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\polly\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
//how to open URL
	driver.get("https://www.dell.com/en-us");
Thread.sleep(3000);
driver.manage().window().maximize();
    
}

@When("^user goes to Apex dropdown menu will be able to see products$")
public void user_goes_to_Apex_dropdown_menu_will_be_able_to_see_products() throws Throwable {
   
	
	Actions act=new Actions(driver);
	DellApexPOM obj=new DellApexPOM(driver);
	act.moveToElement(obj.DellApex()).build().perform();
	
	
}
}


