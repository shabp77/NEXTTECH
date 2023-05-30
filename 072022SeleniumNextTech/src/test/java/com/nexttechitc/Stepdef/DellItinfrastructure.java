package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.pageobjectmodel.DellItinfrastructurePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellItinfrastructure {
WebDriver driver;

@Given("^Users visit Dell homepage$")
public void users_visit_Dell_homepage() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\polly\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
// how to open URL
	driver.get("https://www.dell.com/en-us");
Thread.sleep(3000);
driver.manage().window().maximize();
  
}

@When("^Users go to infrastructure dropdown menu and able to see product$")
public void users_go_to_infrastructure_dropdown_menu_and_able_to_see_product() throws Throwable {
   Actions act=new Actions(driver);
   DellItinfrastructurePOM obj=new DellItinfrastructurePOM(driver);
   act.moveToElement(obj.infrastructure()).build().perform();
   Thread.sleep(3000);
   obj.infrastructure().click();
}

@Then("^users will redirect to the next window$")
public void users_will_redirect_to_the_next_window() throws Throwable {
  }

}
