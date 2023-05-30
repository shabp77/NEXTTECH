Feature:  Validate Facebook signup

Scenario Outline:  Facebook signup

Given user visit Facebook signup page

When user type "<firstname>" and type "<lastname>" and type "<email>" and retype "<email>" type "<password>"

When  user select month  and select day and select year

When  user select gender female

When  click  on signup button

Then user will be able signup Facebook



Examples:
 |firstname|  lastname|email                 |email               |password|
 |Shan     |  Khan    |pollyhaque7@gmail.com | pollyhaque7@gmail.com  |    Nexttech23!|   


