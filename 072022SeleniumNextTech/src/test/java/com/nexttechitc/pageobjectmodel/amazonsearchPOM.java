package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonsearchPOM {
	
	WebDriver driver;
	 public  amazonsearchPOM(WebDriver driver) {
     this.driver=driver;
     PageFactory.initElements(driver,this);
	 }		   
	 @FindBy(name="field-keywords")
		
	 WebElement Type_amazonsearch;
	   
	 public WebElement amazonsearch1(){
		return Type_amazonsearch;
		 }
	 @FindBy(id="twotabsearchtextbox")
		
	 WebElement Click_searchicon;
	   
	 public WebElement searchicon(){
		return Click_searchicon;

}

	
	}

	
	


	
			

		
		 