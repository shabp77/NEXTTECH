package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JcpennyTrendingPOM  {
	
	
	WebDriver driver;
	
	public JcpennyTrendingPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this );
}
	 @FindBy(xpath="//*[@id=\"subMenuLevel1\"]/li[1]/div")
	WebElement Act_Trending_Now;
		public WebElement Trending_Now() {
			return Act_Trending_Now;
	

	}
}