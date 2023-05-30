Feature: Validate Fblogin

Scenario Outline: Facebook login

Given User visit Facebook home page

When  User type valid "<emailaddress>" and valid "<password>"


Then User should be direct to Facebook account page

Examples: 

|emailaddress|     password|
|brainsinjar8@yahoo.com|Nexttechnano|