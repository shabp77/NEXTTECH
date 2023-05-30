package com.nexttechitc.Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestrunnerTestNG {
	@CucumberOptions (
			   
			   features = {"Features"},
			   glue = {"com.nexttechitc.Stepdefs"}
			   
			   )

			public class TestRunner extends AbstractTestNGCucumberTests{}
/*
 *  Automation Framework
 * 1 Maven project : Give us a standard structure to create project
 * 2 BDD cucumber Framework
 * 3 Selenium webdriver automation tool
 * 4 TextNG
 * 5 Testrunner
 * 6 Pageobject Model
 * 7 Language : Java
 */
}
