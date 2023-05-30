package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellItinfrastructurePOM {
	
	WebDriver driver;
	
	 public  DellItinfrastructurePOM(WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver,this);
		 }	
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[3]/button")
		WebElement act_infrastructure;
		public WebElement infrastructure () { 
		 return act_infrastructure ;
		 }	
		
		
		 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/button/span")
			WebElement click_developers;
			public WebElement developers() { 
			 return click_developers;
			}
			
			}
			
			
			
				
			
	  
	 
	 
	 
		 

		 
