package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBlearnmorePOM {
	
	
	WebDriver driver;
	
	 public  FBlearnmorePOM(WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver,this);
		 }	
	 @FindBy(xpath="//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/h3")
		WebElement act_FBlearnmore;
		public WebElement  FBlearnmore() { 
		 return act_FBlearnmore ;
		 }	
		
		
		 @FindBy(xpath="//*[@id=\"non-users-notice-link\"]")
			WebElement click_learnmore;
			public WebElement learnmore() { 
			 return click_learnmore;
			}

}
