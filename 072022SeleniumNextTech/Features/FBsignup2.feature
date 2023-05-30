Feature: Validate FBsignup

Scenario Outline:  Validate creating new Facebook account

Given user visit Facebook home page

When user type "<firstname>" and type "<lastname>" and type "<emailaddress>" and retype "<emailaddress>" and type "<password>"

When user select month and day and year and click gender

When user click on signup button 

Then user will able to go to signup page
  
  
  Examples
 |firstname |lastname|emailaddress         |emailaddress     |password  |
 |Pathan     |Khan   |shabp77@hotmail.com |shabp77@hotmail.com| Shahruk23#|