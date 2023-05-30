package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellApexPOM {
	
	WebDriver driver;
	
	public  DellApexPOM(WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver,this);

}
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/button/span")
		WebElement Act_Apex;
			public WebElement DellApex() {
				return Act_Apex;
	
			}
			
			}	
