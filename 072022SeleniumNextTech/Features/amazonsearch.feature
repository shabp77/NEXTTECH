Feature: Validate Amazon search

Scenario Outline: Validate Amazon search

Given user visit Amazon home page
When user type "<productname>" and click seach icon
Then user should be able to see the expected product

Examples:
|productname|
| smart tv|
