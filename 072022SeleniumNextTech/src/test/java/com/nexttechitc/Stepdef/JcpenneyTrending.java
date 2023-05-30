package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.pageobjectmodel.JcpennyTrendingPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JcpenneyTrending {
	
WebDriver driver;


@Given("^User visits Jcpenny home page$")
public void user_visits_Jcpenny_home_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\polly\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
// how to open URL
	driver.get("https://www.jcpenney.com/");
Thread.sleep(3000);
//maximize the window
driver.manage().window().maximize();
  
}

@When("^User go to Jcpenny dropdown menu to Trending Now will see products$")
public void user_go_to_Jcpenny_dropdown_menu_to_Trending_Now_will_see_products() throws Throwable {
	Actions act=new Actions(driver);
	JcpennyTrendingPOM obj=new JcpennyTrendingPOM(driver);
	act.moveToElement(obj.Trending_Now()).build().perform();
}

	
	
	   	

	

}
			




