Feature: search and place the order of the product


Scenario: Search experience in both home and offer page
Given User is on greenkart landing page
When User searched with short name "tom" and extracted actual name of product
Then usersearched for "tom" shortname in offer page
And  validate product name in offers page matching with lading page 

@regression
Scenario Outline:Search experience in both home and offer page with multipletest data
Given User is on greenkart landing page
When User searched with short name <Name> and extracted actual name of product
Then usersearched for <Name> shortname in offer page
And  validate product name in offers page matching with lading page 

Examples:
|Name|
|Tom|
|beet|

