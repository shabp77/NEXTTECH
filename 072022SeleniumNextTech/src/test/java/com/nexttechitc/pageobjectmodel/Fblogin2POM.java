package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fblogin2POM {
	
	
	WebDriver driver;
	
	public Fblogin2POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this );
	}
	 @FindBy(id="email")
		WebElement Type_email;	
		 public WebElement email() {
			 return Type_email;
		
			 }			 
			 @FindBy(id="pass")
	WebElement Type_password;
		public WebElement password() {
			return Type_password;
}
}